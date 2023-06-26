package pagos;

public interface PagosApi {
	boolean pagarConDebito(TarjetaDebito td,double monto);
	boolean pagarConCredito(TarjetaCredito tc,double monto);

}
