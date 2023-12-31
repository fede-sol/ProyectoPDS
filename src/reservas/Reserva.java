package reservas;

import clientes.Cliente;
import clientes.Huesped;
import facturacion.Factura;
import java.time.LocalDateTime;

import habitaciones.Disponibilidad;
import habitaciones.Habitacion;
import java.util.List;
import pagos.IMedioPago;
import reservas.politicas.IPoliticaReserva;

public class Reserva {
    
    private int nroReserva;
    private LocalDateTime fechaCreacion;
    private Cliente cliente;
    private List<Huesped> huespedes;
    private IMedioPago medioPago;
    private IPoliticaReserva politicaReserva;
    private EstadoReserva estadoReserva;
    private Habitacion habitacion;
    private Disponibilidad disponibilidad;
    private Factura factura;

    public Reserva(int nro, Cliente cliente, List<Huesped> huespedes, Habitacion habitacion, Disponibilidad disponibilidad,IPoliticaReserva politicaReserva) {
        this.nroReserva = nro;
        this.fechaCreacion = LocalDateTime.now();
        this.cliente = cliente;
        this.huespedes = huespedes;
        this.estadoReserva = new EstadoPendiente(this);
        this.habitacion = habitacion;
        this.disponibilidad = disponibilidad;
        this.politicaReserva = politicaReserva;
        
    }
    

    
    

    public double calcularMonto() {
        if(politicaReserva.getPorcentaje() < 0)
            return habitacion.calcularPrecio()*(1-politicaReserva.getPorcentaje()*-1/100);
        else
            return habitacion.calcularPrecio()+(habitacion.calcularPrecio()*(politicaReserva.getPorcentaje()/100));
        
    }

    public void setPoliticaReserva(IPoliticaReserva politicaReserva) {
        this.politicaReserva = politicaReserva;
    }

    public void setMedioPago(IMedioPago medioPago) {
        this.medioPago = medioPago;
    }

    public void setEstado(EstadoReserva estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public boolean pagar() {
        return estadoReserva.pagar();
    }

    public void cancelar() {
        estadoReserva.cancelar();
    }

    
    

    /*
     * Sección de getters y setters
     */
    public int getNro() {
        return nroReserva;
    }
    public void setNro(int nro) {
        this.nroReserva = nro;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Huesped> getHuespedes() {
        return huespedes;
    }

    public void setHuespedes(List<Huesped> huespedes) {
        this.huespedes = huespedes;
    }

    public EstadoReserva getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(EstadoReserva estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Disponibilidad getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Disponibilidad disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public IMedioPago getMedioPago() {
        return medioPago;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    
    
    
    
    
}
