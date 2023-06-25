package pagos;

public class Efectivo implements IMedioPago {

    @Override
    public boolean pagar() {

        return true;
    }

    @Override
    public String toString() {
        return "Efectivo";
    }
}
