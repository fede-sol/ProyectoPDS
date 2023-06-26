package habitaciones;

import habitaciones.extras.Extra;

import java.util.LinkedList;
import java.util.stream.Collectors;

public abstract class Habitacion {

    protected int nroHabitacion;
    protected int cantPersonas;
    protected double montoBase;
    protected ListaDisponibilidades listaDisponibilidades;
    protected LinkedList<Extra> listaExtras;

    public Habitacion(int nroHabitacion, int cantPersonas, double montoBase, LinkedList<Extra> listaExtras) {
        this.nroHabitacion = nroHabitacion;
        this.cantPersonas = cantPersonas;
        this.montoBase = montoBase;
        this.listaExtras = listaExtras;
        this.listaDisponibilidades = new ListaDisponibilidades();
    }

    public int getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(int nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public double getMontoBase() {
        return montoBase;
    }

    public void setMontoBase(double montoBase) {
        this.montoBase = montoBase;
    }

    public ListaDisponibilidades getListaDisponibilidades() {
        return listaDisponibilidades;
    }

    public void setListaDisponibilidades(ListaDisponibilidades listaDisponibilidades) {
        this.listaDisponibilidades = listaDisponibilidades;
    }

    public LinkedList<Extra> getListaExtras() {
        return listaExtras;
    }

    public void setListaExtras(LinkedList<Extra> listaExtras) {
        this.listaExtras = listaExtras;
    }

    public abstract double calcularPrecio();

    @Override
    public abstract String toString();

    public void mostrarDatos() {
        System.out.println("Nro Habitacion: " + getNroHabitacion()
                + ", Cantidad de Personas: " + getCantPersonas()
                + ", Tipo de Habitacion: " + toString()
                + ", Extras: " + listaExtras.stream().map(Object::toString).collect(Collectors.joining(", ")));
    }


}
