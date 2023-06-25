package reservas;

public class Sms implements IMedioContacto {
    
    private String celular;

    public Sms(String celular) {
        this.celular = celular;
    }

    public String getMedioContacto () {
        return celular;
    }
}
