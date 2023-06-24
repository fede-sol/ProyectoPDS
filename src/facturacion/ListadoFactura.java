package facturacion;

import java.util.ArrayList;
import java.util.List;

public class ListadoFactura {
    
    private List<Factura> listadoFacturas;
    
    public ListadoFactura(){
        listadoFacturas = new ArrayList<>();
    }

    public List<Factura> getListadoFacturas() {
        return listadoFacturas;
    }
    
}
