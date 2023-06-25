package reservas;


public class CronJobReserva {
    private Reserva reserva;
    private int horas;
    private GestorReservas gestorReservas;
    
    public CronJobReserva(Reserva r){
        this.reserva = r;
        horas = 24;
        gestorReservas = new GestorReservas();
    }
    
    public void ejecutarChequeoDePago(){
        
        if(reserva.getEstadoReserva().getClass().equals(EstadoPendiente.class))
            gestorReservas.cancelarReserva(reserva);
    }
}
