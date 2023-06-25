package reservas;

public class Email implements IMedioContacto {

    private String email;
    
    public Email(String email) {
        this.email = email;
    }
    
    
    public String getMedioContacto () {
        return email;
    }

}
