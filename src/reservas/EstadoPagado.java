package reservas;

public class EstadoPagado extends EstadoReserva {

    @Override
    public boolean pagar() {
        System.out.println("La reserva ya está pagada");
        return false;
    }

    @Override
    public void cancelar() {
        System.out.println("La reserva no se puede cancelar, ya está pagada");
    }

}
