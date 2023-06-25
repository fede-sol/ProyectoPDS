package notificaciones.sms;

import notificaciones.adaptadores.AdaptadorTwillio;
import notificaciones.IMedioNotificacion;
import notificaciones.Notificacion;

public class NotificadorSms implements IMedioNotificacion{
	private ISmsApi adaptador;

    public NotificadorSms() {
        this.adaptador = new AdaptadorTwillio();
    }

    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        adaptador.enviarSMS(notificacion);
    }

    @Override
    public String toString(){
        return "Sms";
    }
}

