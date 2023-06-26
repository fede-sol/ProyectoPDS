package reservas;

import clientes.Cliente;
import clientes.Email;
import clientes.ListadoClientes;
import clientes.Whatsapp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListadoClientesTest {


    @Test
    public void testAgregarEliminarCliente(){

        ListadoClientes listado = new ListadoClientes();


        listado.agregarCliente(new Cliente("Federico","Solanes","44485728",new Whatsapp("1159761861")));
        listado.agregarCliente(new Cliente("Jorge","Jorge","12345678",new Email("jorge@gmial.com")));

        assertEquals(2,listado.getClientes().size());

        listado.eliminarCliente(listado.buscarCliente("12345678"));

        assertEquals(1,listado.getClientes().size());
    }
}