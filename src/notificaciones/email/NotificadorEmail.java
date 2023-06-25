package notificaciones.email;

import notificaciones.adaptadores.AdaptadorGmail;
import notificaciones.IMedioNotificacion;
import notificaciones.Notificacion;

public class NotificadorEmail implements IMedioNotificacion {
    private IEmailApi adaptador;

    public NotificadorEmail() {
        this.adaptador = new AdaptadorGmail();
    }

    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        adaptador.enviarEmail(notificacion);
    }

    @Override
    public String toString(){
        return "Email";
    }
}
