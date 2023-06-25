package reservas;

public class Whatsapp implements IMedioContacto {
    
    private String celular;

    public Whatsapp(String celular) {
        this.celular = celular;
    }
    
    public String getMedioContacto () {
        return celular;
    }

    @Override
    public String toString(){
        return "Whatsapp";
    }
}
