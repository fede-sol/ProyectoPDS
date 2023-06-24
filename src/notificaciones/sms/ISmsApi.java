package notificaciones.sms;

import notificaciones.Notificacion;

public interface ISmsApi {
    void enviarSMS(Notificacion notificacion);
}

