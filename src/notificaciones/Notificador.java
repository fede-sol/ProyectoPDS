package notificaciones;

import notificaciones.email.NotificadorEmail;
import notificaciones.sms.NotificadorSms;
import notificaciones.whatsapp.NotificadorWhatsapp;
import reservas.*;


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



        if (r.getCliente().getPreferenciaContacto() instanceof Whatsapp) {
            setNotificador(new NotificadorWhatsapp());
        } else if (r.getCliente().getPreferenciaContacto() instanceof Sms) {
            setNotificador(new NotificadorSms());
        } else if (r.getCliente().getPreferenciaContacto() instanceof Email) {
            setNotificador(new NotificadorEmail());
        }



        if (r.getEstadoReserva() instanceof EstadoPendiente) {
            enviar(new Notificacion(r.getCliente().getPreferenciaContacto().getMedioContacto(), "Su reserva ha sido creada exitosamente"));
        } else if (r.getEstadoReserva() instanceof EstadoPagado) {
            Notificacion n = new Notificacion(r.getCliente().getPreferenciaContacto().getMedioContacto(), "Su reserva ha sido pagada exitosamente");
            n.setFactura(r.getFactura());
            enviar(n);
        } else if (r.getEstadoReserva() instanceof EstadoCancelado) {
            enviar(new Notificacion(r.getCliente().getPreferenciaContacto().getMedioContacto(), "Su reserva ha sido cancelada"));
        }

                

        
    }
    
}
