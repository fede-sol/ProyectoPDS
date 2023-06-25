package reservas;

public class AnticipacionQuinceDias implements IPoliticaReserva {

    double monto = 20;

    @Override
    public double getPorcentaje() {
        return monto;
    }

}