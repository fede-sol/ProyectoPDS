package reservas;

import facturacion.GestorFacturas;
import habitaciones.Disponibilidad;
import habitaciones.GestorHabitaciones;
import habitaciones.Habitacion;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import pagos.IMedioPago;


public class GestorReservas {
    
    private ListadoReservas listadoReservas;
    private GestorFacturas gestorFacturas;
    private List<IObservadorReserva> observadores;
    private ListadoClientes listadoClientes;
    private GestorHabitaciones gestorHabitaciones;
    
    public GestorReservas(){
        listadoReservas = new ListadoReservas();
        gestorFacturas = new GestorFacturas();
        observadores = new ArrayList<>();  
        listadoClientes = new ListadoClientes();
        gestorHabitaciones = new GestorHabitaciones();
    }
    
    public void generarReserva(String dniCliente,List<Huesped> listaHuespedes,int nroHabitacion,LocalDate fechaIni,LocalDate fechaFin,IPoliticaReserva politica){
        
        Habitacion habitacionReservada = gestorHabitaciones.buscarHabitacion(nroHabitacion);
        Disponibilidad fechas = new Disponibilidad(fechaIni, fechaFin);
        Reserva r = new Reserva(listadoReservas.getListaReservas().size(),
                                listadoClientes.buscarCliente(dniCliente),
                                listaHuespedes,
                                habitacionReservada,
                                fechas,
                                politica);
        
        listadoReservas.getListaReservas().add(r);
        CronJobReserva job = new CronJobReserva(r);
        habitacionReservada.getListaDisponibilidades().agregarDisponibilidad(fechas);
        notificarCambio(r);
    }
    
    public void cancelarReserva(int nroReserva){
        
        Reserva r = buscarReserva(nroReserva);
        r.cancelar();
        r.getHabitacion().getListaDisponibilidades().removerDisponibilidad(r.getDisponibilidad());
        listadoReservas.getListaReservas().remove(r);
        notificarCambio(r);
    }
    
    public void pagarReserva(int nroReserva,IMedioPago medioDePago){
        Reserva r = buscarReserva(nroReserva);
        r.setMedioPago(medioDePago);
        
        boolean pagoCorrecto = r.pagar();
        
        if (pagoCorrecto)
            r.setFactura(gestorFacturas.generarFactura(r));
            
        notificarCambio(r);
        
    }
    
    public void notificarCambio(Reserva r){
        for (IObservadorReserva observador : observadores)
            observador.notificarCambio(r);
        
    }
    
    public void agregarObservador(IObservadorReserva observador){
        observadores.add(observador);
    }
    
    public void eliminarObservador(IObservadorReserva observador){
        observadores.remove(observador);
    }
    
    public Reserva buscarReserva(int nroReserva){
        for (Reserva reserva : listadoReservas.getListaReservas()) {
            if(reserva.getNro()==nroReserva)
                return reserva;
        }
        
        return null;
    }
    
}
