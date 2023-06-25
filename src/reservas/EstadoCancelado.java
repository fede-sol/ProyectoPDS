package reservas;

public class EstadoCancelado extends EstadoReserva {

    public EstadoCancelado(Reserva reserva) {
        super(reserva);
    }

    @Override
    public boolean pagar() {
        System.out.println("La reserva ya fué cancelada");
        return false;
    }

    @Override
    public void cancelar() {
        System.out.println("La reserva ya se encuentra cancelada");
    }

}
