package notificaciones.adaptadores;

import notificaciones.Notificacion;
import notificaciones.email.IEmailApi;

public class AdaptadorGmail implements IEmailApi {
	    @Override
	    public void enviarEmail(Notificacion notificacion) {
	    	// L�gica de conexi�n con la API de Twilio para enviar el mensaje de WhatsApp
	        System.out.println("Enviando email: " + notificacion.getCuerpoMensaje() +
	                ", al destinatario: " + notificacion.getDestinatario());
	        
	        if (notificacion.getFactura() != null) {
	            System.out.println("Con la factura: " + notificacion.getFactura().getNroFactura());
	        }
	    }
	}



