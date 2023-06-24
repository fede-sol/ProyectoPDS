package notificaciones;

public class Whatsapp implements IMedioNotificacion {
    private IWhatsappApi adaptador;

    public Whatsapp(IWhatsappApi adaptador) {
        this.adaptador = adaptador;
    }

    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        adaptador.enviarWPP(notificacion);
    }
}