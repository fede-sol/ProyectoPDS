package notificaciones;

import reservas.EstadoPendiente;
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
        
        switch(r.getEstadoReserva().getClass().getName()){
            case "EstadoPendiente":
                enviar(new Notificacion(r.getCliente().getPreferenciaContacto().getMedioContacto(), "Su reserva ha sido creada exitosamente"));
            break;
            case "EstadoPagado":
                enviar(new Notificacion(r.getCliente().getPreferenciaContacto().getMedioContacto(), "Su reserva ha sido pagada exitosamente"));
            break;
            case "EstadoCancelado":
                enviar(new Notificacion(r.getCliente().getPreferenciaContacto().getMedioContacto(), "Su reserva ha sido cancelada"));
            break;
        }
                
                
        
        
        
        
        
    }
    
}
