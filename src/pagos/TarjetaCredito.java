package pagos;

public class TarjetaCredito implements IMedioPago{
	
	private String numero;
	private String cvv;
	private String fechaVencimiento;
	private String titular;
	private PagosApi pagoApi;
	
	public TarjetaCredito(String numero, String cvv, String fechaVencimiento, String titular, PagosApi pagoApi) {
		this.numero = numero;
		this.cvv = cvv;
		this.fechaVencimiento = fechaVencimiento;
		this.titular = titular;
		//this.pagoApi = pagoApi;			
		// TODO Auto-generated constructor stub    REVISAR SI VA PAGO API
	}
	
	@Override
	public boolean pagar() {
		return pagoApi.pagarConCredito(this);
		// TODO Auto-generated method stub
	}

}
