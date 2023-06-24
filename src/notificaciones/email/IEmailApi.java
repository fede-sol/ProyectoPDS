package notificaciones.email;

import notificaciones.Notificacion;

public interface IEmailApi {
    void enviarEmail(Notificacion notificacion);
}



