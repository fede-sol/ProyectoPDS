package pagos;

// Tendria que ir un import de MercadoPago

public class AdaptadorMercadoPago implements PagosApi{
	
	private MercadoPago mercadoPago;

    public AdaptadorMercadoPago(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
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
