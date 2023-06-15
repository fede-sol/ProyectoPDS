package reservas;

import facturacion.GestorFacturas;
import java.util.ArrayList;
import java.util.List;


public class GestorReservas {
    
    private ListadoReservas listadoReservas;
    private GestorFacturas gestorFacturas;
    private List<IObservadorReserva> observadores;
    
    public GestorReservas(){
        listadoReservas = new ListadoReservas();
        gestorFacturas = new GestorFacturas();
        observadores = new ArrayList<>();    
    }
    
    public void generarReserva(Reserva r){
        listadoReservas.getListaReservas().add(r);
    }
    
    public void cancelarReserva(Reserva r){
        listadoReservas.getListaReservas().remove(r);
    }
    
    public void pagarReserva(Reserva r){
        
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
    
}
