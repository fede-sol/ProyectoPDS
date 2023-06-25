package reservas;

public class EstadoCancelado extends EstadoReserva {

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
