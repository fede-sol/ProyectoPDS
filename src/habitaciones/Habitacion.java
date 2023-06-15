package habitaciones;

import java.util.LinkedList;

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

}
