package habitaciones;

import java.time.LocalDate;

public class ReporteHabitaciones {

    private GestorHabitaciones gestorHabitaciones;
    private LocalDate fecha;

    public ReporteHabitaciones(GestorHabitaciones gestorHabitaciones, LocalDate fecha) {
        this.gestorHabitaciones = gestorHabitaciones;
        this.fecha = fecha;
    }

    public GestorHabitaciones getGestorHabitaciones() {
        return gestorHabitaciones;
    }

    public void setGestorHabitaciones(GestorHabitaciones gestorHabitaciones) {
        this.gestorHabitaciones = gestorHabitaciones;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void mostrarReporte() {
        System.out.println("Reporte del estado de habitaciones");
        System.out.println("Día: " + fecha);
        for (Habitacion habitacion: gestorHabitaciones.getListaHabitaciones()) {
            if (gestorHabitaciones.estaDisponible(habitacion, fecha, fecha))
                System.out.println("    Nro de habitacion: " + habitacion.getNroHabitacion() + "  Estado: Disponible");
            else
                System.out.println("    Nro de habitacion: " + habitacion.getNroHabitacion() + "  Estado: Reservada");
        }
    }
}
