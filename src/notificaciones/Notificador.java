package notificaciones;

import reservas.IObservadorReserva;
import reservas.Reserva;


public class Notificador implements IObservadorReserva{
    
    IMedioNotificacion medioNotificacion;
    
    public void setNotificador(IMedioNotificacion medioNotificacion){
        this.medioNotificacion = medioNotificacion;
    }
    
    public void enviar(Notificacion notificacion){
        medioNotificacion.enviarNotificacion(notificacion);
    }
    
  

    @Override
    public void notificarCambio(Reserva r) {
        
        enviar(new Notificacion("", "Su reserva ha sido creada exitosamente"));
        
        enviar(new Notificacion("", "Su reserva ha sido pagada exitosamente"));
        
        enviar(new Notificacion("", "Su reserva ha sido cancelada"));
        
    }
    
}
