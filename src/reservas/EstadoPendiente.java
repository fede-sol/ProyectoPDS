package reservas;

public class EstadoPendiente extends EstadoReserva {

    @Override
    public boolean pagar () {
        boolean pagoCorrecto = reserva.getMedioPago().pagar();
        if (pagoCorrecto)
            reserva.setEstado(new EstadoPagado());
        
        return pagoCorrecto;
    }

    @Override
    public void cancelar () {
        reserva.setEstado(new EstadoCancelado());
    }
}
