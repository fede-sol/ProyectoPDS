package reservas;

import clientes.Cliente;
import clientes.Huesped;
import clientes.ListadoClientes;
import clientes.Whatsapp;
import habitaciones.*;
import habitaciones.extras.Extra;
import habitaciones.extras.Internet;
import habitaciones.extras.MiniBar;
import habitaciones.extras.Suite;
import notificaciones.Notificador;
import org.junit.jupiter.api.Test;
import pagos.TarjetaCredito;
import reservas.politicas.AnticipacionDosMeses;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GestorReservasTest {


    @Test
    public void testReservarYNotificar(){

        GestorHabitaciones gestorHabitaciones = GestorHabitaciones.getInstancia();

        LinkedList<Extra> extras = new LinkedList<>();
        extras.add(new Internet(2000));
        extras.add(new MiniBar(400));

        Habitacion h = new Comun(1,4,20000,extras,0);
        gestorHabitaciones.agregarHabitacion(h);

        h = new Suite(2,2,30000,new LinkedList<>(),10000);
        h.getListaDisponibilidades().agregarDisponibilidad(new Disponibilidad(LocalDate.of(2023,3,1),LocalDate.of(2023,3,10)));
        gestorHabitaciones.agregarHabitacion(h);


        ListadoClientes listadoClientes = ListadoClientes.getInstancia();
        listadoClientes.agregarCliente(new Cliente("Federico","Solanes","44485728",new Whatsapp("115976861")));

        List<Huesped> huespedes = new LinkedList<>();
        huespedes.add(new Huesped("Jorge","Jorge","123"));
        huespedes.add(new Huesped("Federico","Solanes","44485728"));


        GestorReservas gestorReservas = new GestorReservas();


        gestorReservas.agregarObservador(new Notificador());

        gestorReservas.generarReserva("44485728",huespedes,2,LocalDate.of(2023,1,1),LocalDate.of(2023,1,10),new AnticipacionDosMeses());

    }


    @Test
    public void testPagarYNotificar(){

        testReservarYNotificar();//Corremos el método de nuevo para no copiar y pegar

        GestorReservas gestorReservas = new GestorReservas();
        gestorReservas.agregarObservador(new Notificador());

        gestorReservas.pagarReserva(0,new TarjetaCredito("123456778","123","02/24","Fede"));



    }

    @Test
    public void testCancelarYNotificar(){

        testReservarYNotificar();//Corremos el método de nuevo para no copiar y pegar


        GestorReservas gestorReservas = new GestorReservas();
        gestorReservas.agregarObservador(new Notificador());

        GestorHabitaciones gestorHabitaciones = GestorHabitaciones.getInstancia();

        assertEquals(false,gestorHabitaciones.estaDisponible(gestorHabitaciones.buscarHabitacion(2), LocalDate.of(2023,1,1),LocalDate.of(2023,1,10)));


        gestorReservas.cancelarReserva(0);

        assertEquals(true,gestorHabitaciones.estaDisponible(gestorHabitaciones.buscarHabitacion(2), LocalDate.of(2023,1,1),LocalDate.of(2023,1,10)));
    }
}