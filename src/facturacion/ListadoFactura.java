package facturacion;

import java.util.ArrayList;
import java.util.List;

public class ListadoFactura {
    
    private List<Factura> listadoFacturas;
    private static ListadoFactura instancia;

    public static ListadoFactura getInstancia(){
        if(instancia == null)
            instancia = new ListadoFactura();

        return instancia;
    }
    public ListadoFactura(){
        listadoFacturas = new ArrayList<>();
    }

    public List<Factura> getListadoFacturas() {
        return listadoFacturas;
    }
    
}
