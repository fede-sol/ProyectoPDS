package notificaciones;

public class Sms implements IMedioNotificacion{
	private ISmsApi adaptador;

    public Sms(ISmsApi adaptador) {
        this.adaptador = adaptador;
    }

    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        adaptador.enviarSMS(notificacion);
    }
}

