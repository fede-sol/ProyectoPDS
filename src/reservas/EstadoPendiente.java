package reservas;

public class EstadoPendiente extends EstadoReserva {

    public EstadoPendiente(Reserva reserva) {
        super(reserva);
    }

    @Override
    public boolean pagar () {
        boolean pagoCorrecto = reserva.getMedioPago().pagar(reserva.calcularMonto());
        if (pagoCorrecto)
            reserva.setEstado(new EstadoPagado(reserva));
        
        return pagoCorrecto;
    }

    @Override
    public void cancelar () {
        reserva.setEstado(new EstadoCancelado(reserva));
    }
}
