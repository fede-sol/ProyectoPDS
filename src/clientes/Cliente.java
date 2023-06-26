package clientes;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private IMedioContacto preferenciaContacto;

    public Cliente(String nombre, String apellido, String dni, IMedioContacto preferenciaContacto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.preferenciaContacto = preferenciaContacto;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public IMedioContacto getPreferenciaContacto() {
        return preferenciaContacto;
    }

    public void setPreferenciaContacto(IMedioContacto preferenciaContacto) {
        this.preferenciaContacto = preferenciaContacto;
    }
    
    
}
