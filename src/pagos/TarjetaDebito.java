package pagos;

public class TarjetaDebito implements IMedioPago{
	private String numero;
	private String cvv;
	private String fechaVencimiento;
	private String titular;
	private PagosApi pagoApi;
	
	public TarjetaDebito(String numero, String cvv, String fechaVencimiento, String titular, PagosApi pagoApi) {
		this.numero = numero;
		this.cvv = cvv;
		this.fechaVencimiento = fechaVencimiento;
		this.titular = titular;
		this.pagoApi = pagoApi;

	}
	
	
	@Override
	public boolean pagar() {
		return pagoApi.pagarConDebito(this);
		
	}

	

}
