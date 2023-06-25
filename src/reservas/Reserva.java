package reservas;

import java.time.LocalDateTime;

import habitaciones.Disponibilidad;
import habitaciones.Habitacion;
import java.util.List;
import pagos.IMedioPago;

public class Reserva {
    
    private LocalDateTime fechaCreacion;
    private Cliente cliente;
    private List<Huesped> huespedes;
    private IMedioPago medioPago;
    private IPoliticaReserva politicaReserva;
    private EstadoReserva estadoReserva;
    private Habitacion habitacion;
    private Disponibilidad disponibilidad;
    

    
    

    public double calcularMonto() {
        return habitacion.calcularPrecio()-(1-politicaReserva.getPorcentaje()/100);
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

    public void pagar() {
        estadoReserva.pagar();
    }

    public void cancelar() {
        estadoReserva.cancelar();
    }

    
    
    
    
    /*
     * Sección de getters y setters
     */
    
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
    
    
    
    
    
}
