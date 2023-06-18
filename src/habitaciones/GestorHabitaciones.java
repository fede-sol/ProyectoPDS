package habitaciones;

import java.time.LocalDate;
import java.util.LinkedList;

public class GestorHabitaciones {

    private LinkedList<Habitacion> listaHabitaciones;

    public GestorHabitaciones() {
        listaHabitaciones = new LinkedList<Habitacion>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        listaHabitaciones.add(habitacion);
    }

    public LinkedList<Habitacion> getListaHabitaciones() {
        return (LinkedList<Habitacion>) listaHabitaciones.clone();
    }

    public LinkedList<Habitacion> filtrarHabitaciones(Filtro filtro) {
        LinkedList<Habitacion> habitacionesDisponibles = new LinkedList<Habitacion>();

        for (Habitacion habitacion: listaHabitaciones) {
            if (habitacion.getCantPersonas() == filtro.getCantPersonas() && habitacion.toString().equals(filtro.getTipoHabitacion())
            && estaDisponible(habitacion, filtro.getFechaIni(), filtro.getFechaFin()) && tieneExtras(habitacion, filtro.getExtras())) {
                habitacionesDisponibles.add(habitacion);
            }
        }

        return habitacionesDisponibles;
    }

    public boolean estaDisponible(Habitacion habitacion, LocalDate fechaIni, LocalDate fechaFin) {
        boolean estaDisponible = true;
        for (Disponibilidad disponibilidad: habitacion.getListaDisponibilidades().getListaDisponibilidades()) {
            if (fechaIni.isBefore(disponibilidad.getFechaFin()) && (fechaFin.isAfter(disponibilidad.getFechaIni()))) {
                estaDisponible = false;
                break;
            }
        }
        return estaDisponible;
    }

    private boolean tieneExtras(Habitacion habitacion, LinkedList<Extra> extras) {
        boolean tieneExtras = true;
        for (Extra extra: extras) {
            String textoExtra = extra.toString();
            if (!habitacion.getListaExtras().stream().anyMatch(extraHabitacion -> extraHabitacion.toString().equals(textoExtra))) {
                tieneExtras = false;
                break;
            }
        }
        return tieneExtras;
    }

    public ReporteHabitaciones generarReporte(LocalDate fecha) {
        return new ReporteHabitaciones(this, fecha);
    }

}
