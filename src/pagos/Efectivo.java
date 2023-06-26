package pagos;

public class Efectivo implements IMedioPago {

    @Override
    public boolean pagar(double monto) {
        System.out.println("Se pagaron $"+monto+ " en efectivo");
        return true;
    }

    @Override
    public String toString() {
        return "Efectivo";
    }
}
