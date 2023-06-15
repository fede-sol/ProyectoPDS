package reservas;

import java.util.LinkedList;
import java.util.List;

public class ListadoReservas {

    private List<Reserva> listaReservas;


    public ListadoReservas(){

        listaReservas = new LinkedList<>();
    }
    
    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

   
}
