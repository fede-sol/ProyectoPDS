package pagos;

// Tendria que ir un import de MercadoPago

import apis.MercadoPagoAPI;

public class AdaptadorMercadoPago implements PagosApi{
	
	private MercadoPagoAPI mercadoPagoAPI;

    public AdaptadorMercadoPago() {
        this.mercadoPagoAPI = new MercadoPagoAPI();
    }

    @Override
    public boolean pagarConDebito(TarjetaDebito td) {
        return mercadoPagoAPI.pagarConDebitoMP();
    }

    @Override
    public boolean pagarConCredito(TarjetaCredito tc) {
        return mercadoPagoAPI.pagarConCreditoMP();
    }	

}
