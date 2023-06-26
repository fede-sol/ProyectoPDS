package pagos;

// Tendria que ir un import de MercadoPago

import apis.MercadoPagoAPI;

public class AdaptadorMercadoPago implements PagosApi{
	
	private MercadoPagoAPI mercadoPagoAPI;

    public AdaptadorMercadoPago() {
        this.mercadoPagoAPI = new MercadoPagoAPI();
    }

    @Override
    public boolean pagarConDebito(TarjetaDebito td,double monto) {
        return mercadoPagoAPI.pagarConDebitoMP(monto,td.getNumero(),td.getCvv(),td.getFechaVencimiento(),td.getTitular());
    }

    @Override
    public boolean pagarConCredito(TarjetaCredito tc,double monto) {
        return mercadoPagoAPI.pagarConCreditoMP(monto,tc.getNumero(),tc.getCvv(),tc.getFechaVencimiento(),tc.getTitular());
    }	

}
