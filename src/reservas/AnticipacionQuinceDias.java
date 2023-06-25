package reservas;

public class AnticipacionQuinceDias implements IPoliticaReserva {

    double monto = -15;

    @Override
    public double getPorcentaje() {
        return monto;
    }

}