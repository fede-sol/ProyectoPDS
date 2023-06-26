package habitaciones;

import habitaciones.extras.Extra;

import java.time.LocalDate;
import java.util.LinkedList;

public class Filtro {

    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private int cantPersonas;
    private LinkedList<Extra> extras;
    private String tipoHabitacion; //esto tal vez podria ser enumeracion?

    public Filtro(LocalDate fechaIni, LocalDate fechaFin, int cantPersonas, LinkedList<Extra> extras, String tipoHabitacion) {
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.cantPersonas = cantPersonas;
        this.extras = extras;
        this.tipoHabitacion = tipoHabitacion;
    }

    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public LinkedList<Extra> getExtras() {
        return extras;
    }

    public void setExtras(LinkedList<Extra> extras) {
        this.extras = extras;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
}
