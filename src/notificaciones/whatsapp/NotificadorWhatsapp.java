package notificaciones.whatsapp;

import notificaciones.adaptadores.AdaptadorTwillio;
import notificaciones.IMedioNotificacion;
import notificaciones.Notificacion;

public class NotificadorWhatsapp implements IMedioNotificacion {
    private IWhatsappApi adaptador;

    public NotificadorWhatsapp() {
        this.adaptador = new AdaptadorTwillio();
    }

    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        adaptador.enviarWPP(notificacion);
    }

    @Override
    public String toString(){
        return "Whatsapp";
    }
}