package notificaciones.whatsapp;

import notificaciones.adaptadores.AdaptadorTwillio;
import notificaciones.IMedioNotificacion;
import notificaciones.Notificacion;

public class Whatsapp implements IMedioNotificacion {
    private IWhatsappApi adaptador;

    public Whatsapp() {
        this.adaptador = new AdaptadorTwillio();
    }

    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        adaptador.enviarWPP(notificacion);
    }
}