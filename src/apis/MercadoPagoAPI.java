package apis;



public class MercadoPagoAPI {
	
	public boolean pagarConDebitoMP(double monto) {
        System.out.println("Mercadopago: Pago con MercadoPago con tarjeta de débito. Monto: $"+monto);
        return true;
    }

    public boolean pagarConCreditoMP(double monto) {
        System.out.println("Mercadopago: Pago realizado con tarjeta de crédito. Monto: $"+monto);
        return true;
    }

}
