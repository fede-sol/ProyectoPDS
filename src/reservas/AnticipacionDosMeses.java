package reservas;

public class AnticipacionDosMeses implements IPoliticaReserva {

    private double porcentaje = 20;

    @Override
    public double getPorcentaje() {
        return porcentaje;
    }

}
