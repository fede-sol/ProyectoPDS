package pagos;

public class TarjetaCredito implements IMedioPago{
	
	private String numero;
	private String cvv;
	private String fechaVencimiento;
	private String titular;
	private PagosApi pagoApi;
	
	public TarjetaCredito(String numero, String cvv, String fechaVencimiento, String titular) {
		this.numero = numero;
		this.cvv = cvv;
		this.fechaVencimiento = fechaVencimiento;
		this.titular = titular;
		this.pagoApi = new AdaptadorMercadoPago();


	}
	
	@Override
	public boolean pagar(double monto) {
		return pagoApi.pagarConCredito(this,monto);

	}
        
        @Override
        public String toString(){
            return "Tarjeta de crédito";
        }

}
