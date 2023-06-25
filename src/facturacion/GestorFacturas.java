package facturacion;

import reservas.Reserva;


public class GestorFacturas {
    
    private ListadoFactura listadoFacturas;
    
    public Factura generarFactura(Reserva r){
        Factura f = new Factura(listadoFacturas.getListadoFacturas().size(),
                                r.getCliente().getNombre(),
                                r.getCliente().getApellido(),
                                21,
                                r.getMedioPago().toString(),
                                r.calcularMonto());
        
        listadoFacturas.getListadoFacturas().add(f);
        return f;
    }
}
