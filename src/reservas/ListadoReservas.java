package reservas;

import java.util.LinkedList;
import java.util.List;

public class ListadoReservas {

    private List<Reserva> listaReservas;

    private static ListadoReservas instancia;

    public static ListadoReservas getInstancia(){
        if(instancia == null)
            instancia = new ListadoReservas();

        return instancia;
    }
    public ListadoReservas(){

        listaReservas = new LinkedList<>();
    }
    
    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

   
}
