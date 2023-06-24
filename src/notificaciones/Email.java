package notificaciones;

public class Email implements IMedioNotificacion {
    private IEmailApi adaptador;

    public Email(IEmailApi adaptador) {
        this.adaptador = adaptador;
    }

    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        adaptador.enviarEmail(notificacion);
    }
}
