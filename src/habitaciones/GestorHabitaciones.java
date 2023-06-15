package habitaciones;

import reservas.ListadoReservas;
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
            //filtro
        }

        return habitacionesDisponibles;
    }

}
