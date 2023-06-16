package habitaciones;

import java.time.LocalDate;

public class Disponibilidad {

    private LocalDate fechaIni;
    private LocalDate fechaFin;

    public Disponibilidad(LocalDate fechaIni, LocalDate fechaFin) {
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
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
}
