package pagos;

public class Transferencia implements IMedioPago{
	
	private String comprobanteDeTransferencia;

	public Transferencia(String comprobanteDeTransferencia) {
		this.comprobanteDeTransferencia = comprobanteDeTransferencia;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean pagar() {
		// TODO Auto-generated method stub
		return true;
	}
	
	

}
