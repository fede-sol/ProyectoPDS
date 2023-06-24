package reservas;

abstract class EstadoReserva {
    protected Reserva reserva;

    public boolean pagar () {
        return false;
    }

    public void cancelar () {
        System.out.println("La reserva no se puede cancelar");
    }

}
