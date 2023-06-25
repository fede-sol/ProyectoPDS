package reservas;

public abstract class EstadoReserva {
    protected Reserva reserva;

    public EstadoReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public abstract boolean pagar ();

    public abstract void cancelar ();

}
