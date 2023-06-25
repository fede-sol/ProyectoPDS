package notificaciones;

public class TwillioAPI {
	public final void sendSMS (String recipient, String message) {
		System.out.println("TwilioApi: sms enviado correctamente");
		System.out.println("\n\nMensaje: \n"+message);
	}
        
        public final void sendWP (String recipient, String message) {
		System.out.println("TwilioApi: Wp enviado correctamente");
		System.out.println("\n\nMensaje: \n"+message);

	}

}
