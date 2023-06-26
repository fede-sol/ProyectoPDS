package pagos;

public class TarjetaDebito implements IMedioPago {

    private String numero;
    private String cvv;
    private String fechaVencimiento;
    private String titular;
    private PagosApi pagoApi;

    public TarjetaDebito(String numero, String cvv, String fechaVencimiento, String titular) {
        this.numero = numero;
        this.cvv = cvv;
        this.fechaVencimiento = fechaVencimiento;
        this.titular = titular;
        this.pagoApi = new AdaptadorMercadoPago();

    }

    @Override
    public boolean pagar(double monto) {
        return pagoApi.pagarConDebito(this,monto);

    }

    @Override
    public String toString() {
        return "Tarjeta de débito";
    }

}
