package pagos;

// Tendria que ir un import de MercadoPago

public class AdaptadorMercadoPago implements PagosApi{
	
	private MercadoPago mercadoPago;

    public AdaptadorMercadoPago() {
        this.mercadoPago = new MercadoPago();
    }

    @Override
    public boolean pagarConDebito(TarjetaDebito td) {
        return mercadoPago.pagarConDebitoMP(td);
    }

    @Override
    public boolean pagarConCredito(TarjetaCredito tc) {
        return mercadoPago.pagarConCreditoMP(tc);
    }	

}
