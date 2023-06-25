package reservas;

import java.util.LinkedList;

public class ListadoClientes {
    LinkedList<Cliente> clientes;

    public void agregarCliente (Cliente cliente) {
        clientes.add(cliente);
    }

    public void eliminarCliente (Cliente cliente) {
        clientes.remove(cliente);
    }
}
