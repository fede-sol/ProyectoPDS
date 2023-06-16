package habitaciones;

import reservas.ListadoReservas;

import java.time.LocalDate;
import java.util.LinkedList;

public class GestorHabitaciones {

    private LinkedList<Habitacion> listaHabitaciones;
    private ListadoReservas listadoReservas;

    public GestorHabitaciones() {
        listaHabitaciones = new LinkedList<Habitacion>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        listaHabitaciones.add(habitacion);
    }

    public LinkedList<Habitacion> filtrarHabitaciones(Filtro filtro) {
        LinkedList<Habitacion> habitacionesDisponibles = new LinkedList<Habitacion>();

        for (Habitacion habitacion: listaHabitaciones) {
            if (habitacion.getCantPersonas() == filtro.getCantPersonas() && habitacion.toString().equals(filtro.getTipoHabitacion())
            && estaDisponible(habitacion, filtro.getFechaIni(), filtro.getFechaFin())) {
                habitacionesDisponibles.add(habitacion);
            }
        }

        return habitacionesDisponibles;
    }

    private boolean estaDisponible(Habitacion habitacion, LocalDate fechaIni, LocalDate fechaFin) {
        boolean estaDisponible = true;
        for (Disponibilidad disponibilidad: habitacion.getListaDisponibilidades().getListaDisponibilidades()) {
            if (fechaIni.isBefore(disponibilidad.getFechaFin()) || fechaIni.isEqual(disponibilidad.getFechaFin())
            && (fechaFin.isAfter(disponibilidad.getFechaIni())) || fechaFin.isEqual(disponibilidad.getFechaFin())) {
                estaDisponible = false;
                break;
            }
        }
        return estaDisponible;
    }

}
