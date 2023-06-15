package facturacion;

import java.util.ArrayList;
import java.util.List;

public class ListadoFacura {
    
    private List<Factura> listadoFacturas;
    
    public ListadoFacura(){
        listadoFacturas = new ArrayList<>();
    }

    public List<Factura> getListadoFacturas() {
        return listadoFacturas;
    }
    
}
