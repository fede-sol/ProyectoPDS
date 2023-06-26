package habitaciones;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GestorHabitacionesTest {


    @Test
    public void testAgregarHabitacion(){
        GestorHabitaciones gestor = new GestorHabitaciones();
        LinkedList<Extra> extras = new LinkedList<>();
        extras.add(new Internet(2000));
        extras.add(new MiniBar(400));

        Habitacion h = new Comun(1,4,20000,extras,0);
        gestor.agregarHabitacion(h);

        h = new Suite(2,2,30000,new LinkedList<>(),10000);
        gestor.agregarHabitacion(h);

        assertEquals(2,gestor.getListaHabitaciones().size());

    }

    @Test
    public void testFiltrarHabitacion(){

        GestorHabitaciones gestor = new GestorHabitaciones();
        LinkedList<Extra> extras = new LinkedList<>();
        extras.add(new Internet(2000));
        extras.add(new MiniBar(400));

        Habitacion h = new Comun(1,4,20000,extras,0);
        gestor.agregarHabitacion(h);

        h = new Suite(2,2,30000,new LinkedList<>(),10000);
        gestor.agregarHabitacion(h);

        Filtro filtro = new Filtro(LocalDate.of(2023,3,1),LocalDate.of(2023,3,7),4,extras,"Comun");
        LinkedList<Habitacion> habitacionFiltrada = gestor.filtrarHabitaciones(filtro);

        for (Habitacion habitacion: habitacionFiltrada) {
            habitacion.mostrarDatos();
        }

        assertEquals(1,habitacionFiltrada.size());
    }


    @Test
    public void testGenerarReporte(){
        GestorHabitaciones gestor = new GestorHabitaciones();

        LinkedList<Extra> extras = new LinkedList<>();
        extras.add(new Internet(2000));
        extras.add(new MiniBar(400));

        Habitacion h = new Comun(1,4,20000,extras,0);
        gestor.agregarHabitacion(h);

        h = new Suite(2,2,30000,new LinkedList<>(),10000);
        h.getListaDisponibilidades().agregarDisponibilidad(new Disponibilidad(LocalDate.of(2023,3,1),LocalDate.of(2023,3,10)));
        gestor.agregarHabitacion(h);


        gestor.generarReporte(LocalDate.of(2023,3,5)).mostrarReporte();
    }
}