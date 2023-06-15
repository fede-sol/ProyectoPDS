package habitaciones;

public abstract class Extra {

    protected double precio;

    public Extra(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
