package Notificaciones;

public class TwillioAPI {
	public final void sendSMS (String recipient, String message) {
		System.out.printf("Mandando SMS: %s el mensaje: %s\n", recipient, message);
	}
        
        public final void sendWP (String recipient, String message) {
		System.out.printf("Mandando Whatsapp: %s el mensaje: %s\n", recipient, message);
	}

}
