package notificaciones.adaptadores;

import notificaciones.TwillioAPI;
import notificaciones.Notificacion;
import notificaciones.whatsapp.IWhatsappApi;
import notificaciones.sms.ISmsApi;

public class AdaptadorTwillio implements ISmsApi, IWhatsappApi {

    private TwillioAPI twillioApi = new TwillioAPI();

    @Override
    public void enviarSMS(Notificacion notificacion) {
        // Lógica de conexión con la API de Twilio para enviar el mensaje SMS
        System.out.println("Enviando mensaje SMS: " + notificacion.getCuerpoMensaje() + ", al destinatario: " + notificacion.getDestinatario());
        if (notificacion.getFactura() != null) {
            System.out.println("Con la factura: " + notificacion.getFactura().getNroFactura());
            twillioApi.sendSMS(notificacion.getDestinatario(), notificacion.getCuerpoMensaje()
                    + "\n \n La factura: Nro " + notificacion.getFactura().getNroFactura()
                    + "\n" + notificacion.getFactura().getMedioDePago()
                    + "\n Total=" + notificacion.getFactura().getMonto());

        } else {
            twillioApi.sendSMS(notificacion.getDestinatario(), notificacion.getCuerpoMensaje());
        }
    }

    @Override
    public void enviarWPP(Notificacion notificacion) {
        // Lógica de conexión con la API de Twilio para enviar el mensaje de WhatsApp
        System.out.println("Enviando mensaje de WhatsApp: " + notificacion.getCuerpoMensaje() + ", al destinatario: " + notificacion.getDestinatario());
        if (notificacion.getFactura() != null) {
            twillioApi.sendWP(notificacion.getDestinatario(), notificacion.getCuerpoMensaje()
                    + "\n \n La factura: Nro " + notificacion.getFactura().getNroFactura()
                    + "\n" + notificacion.getFactura().getMedioDePago()
                    + "\n Total=" + notificacion.getFactura().getMonto());

        } else {
            twillioApi.sendWP(notificacion.getDestinatario(), notificacion.getCuerpoMensaje());
        }
    }
}
