package reservas;

public abstract class EstadoReserva {
    protected Reserva reserva;

    public abstract boolean pagar ();

    public abstract void cancelar ();

}
