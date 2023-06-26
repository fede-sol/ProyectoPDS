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


	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}



}
