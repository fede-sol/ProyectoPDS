package apis;



public class MercadoPagoAPI {
	
	public boolean pagarConDebitoMP() {
        System.out.println("Realizando pago con MercadoPago con tarjeta de débito.");
        return true;
    }

    public boolean pagarConCreditoMP() {
        System.out.println("Realizando pago con MercadoPago con tarjeta de crédito.");
        return true;
    }

}
