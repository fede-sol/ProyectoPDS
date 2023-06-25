package reservas;

import java.time.LocalDateTime;

import habitaciones.Disponibilidad;
import habitaciones.Habitacion;
import pagos.IMedioPago;

public class Reserva {
    LocalDateTime fechaCreacion;
    Cliente cliente;
    List<Huesped> huespedes;
    IMedioPago medioPago;
    IPoliticaReserva politicaReserva;
    EstadoReserva estadoReserva;
    Habitacion habitacion;
    Disponibilidad disponibilidad;

    public double calcularMonto() {
        return (IPoliticaReserva.getPorcentaje() * 100)/habitacion.calcularPrecio();
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

}
