package pagos;

public interface PagosApi {
	boolean pagarConDebito(TarjetaDebito td);
	boolean pagarConCredito(TarjetaCredito tc);

}
