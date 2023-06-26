package reservas.politicas;

public class AnticipacionQuinceDias implements IPoliticaReserva {

    private double porcentaje = -15;

    @Override
    public double getPorcentaje() {
        return porcentaje;
    }



}