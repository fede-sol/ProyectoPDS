package notificaciones.adaptadores;

import notificaciones.GmailAPI;
import notificaciones.Notificacion;
import notificaciones.email.IEmailApi;

public class AdaptadorGmail implements IEmailApi {

    private GmailAPI gmailApi = new GmailAPI();

    @Override
    public void enviarEmail(Notificacion notificacion) {

        System.out.println("Enviando email: " + notificacion.getCuerpoMensaje()
                + ", al destinatario: " + notificacion.getDestinatario());

        if (notificacion.getFactura() != null) {
            System.out.println("Con la factura: " + notificacion.getFactura().getNroFactura());
            gmailApi.sendMAIL(notificacion.getDestinatario(), notificacion.getCuerpoMensaje()+ 
                    "\n \n La factura: Nro "+notificacion.getFactura().getNroFactura()+
                    "\n"+notificacion.getFactura().getMedioDePago()+
                    "\n Total="+notificacion.getFactura().getMonto());

        } else {
            gmailApi.sendMAIL(notificacion.getDestinatario(), notificacion.getCuerpoMensaje());
        }
    }
}
