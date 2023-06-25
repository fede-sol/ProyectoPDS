package reservas;

public class AnticipacionDosMeses implements IPoliticaReserva {

    private double monto = 20;

    @Override
    public double getPorcentaje() {
        return monto;
    }

}
