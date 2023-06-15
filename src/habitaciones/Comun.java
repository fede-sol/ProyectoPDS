package habitaciones;

import java.util.LinkedList;

public class Comun extends Habitacion {

    private double precioExtra;
    public Comun(int nroHabitacion, int cantPersonas, double montoBase, LinkedList<Extra> listaExtras, double precioExtra) {
        super(nroHabitacion, cantPersonas, montoBase, listaExtras);
        this.precioExtra = precioExtra;
    }

    @Override
    public double calcularPrecio() {
        return this.montoBase + this.precioExtra + this.listaExtras.stream().mapToDouble(Extra::getPrecio).sum();
    }

    @Override
    public String toString() {
        return "Comun";
    }

}
