package notificaciones.sms;

import notificaciones.adaptadores.AdaptadorTwillio;
import notificaciones.IMedioNotificacion;
import notificaciones.Notificacion;

public class Sms implements IMedioNotificacion{
	private ISmsApi adaptador;

    public Sms() {
        this.adaptador = new AdaptadorTwillio();
    }

    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        adaptador.enviarSMS(notificacion);
    }
}

