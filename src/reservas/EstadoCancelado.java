package reservas;

public class EstadoCancelado extends EstadoReserva {

    @Override
    public boolean pagar() {
        return false;
    }

    @Override
    public void cancelar() {
        System.out.println("La reserva no se puede cancelar");
    }

}
