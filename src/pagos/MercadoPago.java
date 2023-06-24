package pagos;

public class MercadoPago {
	
	public boolean pagarConDebitoMP(TarjetaDebito tarjeta) {
        System.out.println("Realizando pago con MercadoPago con tarjeta de débito.");
        return true;
    }

    public boolean pagarConCreditoMP(TarjetaCredito tarjeta) {
        System.out.println("Realizando pago con MercadoPago con tarjeta de crédito.");
        return true;
    }

}
