package notificaciones.email;

import notificaciones.adaptadores.AdaptadorGmail;
import notificaciones.IMedioNotificacion;
import notificaciones.Notificacion;

public class Email implements IMedioNotificacion {
    private IEmailApi adaptador;

    public Email() {
        this.adaptador = new AdaptadorGmail();
    }

    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        adaptador.enviarEmail(notificacion);
    }
}
