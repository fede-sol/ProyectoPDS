package apis;

public class TwillioAPI {
	public final void sendSMS (String recipient, String message) {
		System.out.println("TwilioApi: sms enviado correctamente");
		System.out.println("Mensaje: \n"+message);
		System.out.println();
	}
        
        public final void sendWP (String recipient, String message) {
		System.out.println("TwilioApi: Wp enviado correctamente");
		System.out.println("Mensaje: \n"+message);
		System.out.println();
	}

}
