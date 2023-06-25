package facturacion;

public class Factura {
    private int nroFactura;
    private String nombre;
    private String apellido;
    private int iva;
    private String medioDePago;
    private double monto;

    public Factura(int nroFactura, String nombre, String apellido, int iva, String medioDePago, double monto) {
        this.nroFactura = nroFactura;
        this.nombre = nombre;
        this.apellido = apellido;
        this.iva = iva;
        this.medioDePago = medioDePago;
        this.monto = monto;
    }
    
    
    
    
    
    
    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public String getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(String medioDePago) {
        this.medioDePago = medioDePago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
}
