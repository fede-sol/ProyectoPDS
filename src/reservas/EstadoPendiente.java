package reservas;

public class EstadoPendiente extends EstadoReserva {

    @Override
    public boolean pagar () {
        System.out.println("La reserva se ha pagado");
        reserva.setEstado(new EstadoPagado());
        return true;
    }

    @Override
    public void cancelar () {
        System.out.println("La reserva se ha cancelado");
        reserva.setEstado(new EstadoCancelado());
    }
}
