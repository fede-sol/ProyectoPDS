package reservas;

import java.util.LinkedList;

public class ListadoClientes {
    private LinkedList<Cliente> clientes;

    public void agregarCliente (Cliente cliente) {
        clientes.add(cliente);
    }

    public void eliminarCliente (Cliente cliente) {
        clientes.remove(cliente);
    }
    
    public Cliente buscarCliente(String dni){
        for (Cliente cliente : clientes) {
            if(cliente.getDni().equals(dni))
                return cliente;
        }
        
        System.out.println("No existe un cliente con ese dni");
        return null;
    }
}
