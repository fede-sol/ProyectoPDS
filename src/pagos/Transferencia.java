package pagos;

public class Transferencia implements IMedioPago {

    private String comprobanteDeTransferencia;

    public Transferencia(String comprobanteDeTransferencia) {
        this.comprobanteDeTransferencia = comprobanteDeTransferencia;
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean pagar(double monto) {
        System.out.println("Se pagaron $"+monto+ " por transferencia");

        return true;
    }

    @Override
    public String toString() {
        return "Transferencia";
    }

}
