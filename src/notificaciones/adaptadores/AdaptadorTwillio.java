package notificaciones.adaptadores;

import notificaciones.Notificacion;
import notificaciones.whatsapp.IWhatsappApi;
import notificaciones.sms.ISmsApi;

public class AdaptadorTwillio implements ISmsApi, IWhatsappApi {
	    @Override
	    public void enviarSMS(Notificacion notificacion) {
	        // Lógica de conexión con la API de Twilio para enviar el mensaje SMS
	        System.out.println("Enviando mensaje SMS: " + notificacion.getCuerpoMensaje() + ", al destinatario: " + notificacion.getDestinatario());
	        if (notificacion.getFactura() != null) {
	            System.out.println("Con la factura: " + notificacion.getFactura().getNroFactura());
	        }
	    }

	    @Override
	    public void enviarWPP(Notificacion notificacion) {
	        // Lógica de conexión con la API de Twilio para enviar el mensaje de WhatsApp
	        System.out.println("Enviando mensaje de WhatsApp: " + notificacion.getCuerpoMensaje() + ", al destinatario: " + notificacion.getDestinatario());
	        if (notificacion.getFactura() != null) {
	            System.out.println("Con la factura: " + notificacion.getFactura().getNroFactura());
	        }
	    }
	}



