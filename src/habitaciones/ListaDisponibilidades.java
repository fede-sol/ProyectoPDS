package habitaciones;

import java.util.LinkedList;

public class ListaDisponibilidades {

    private LinkedList<Disponibilidad> disponibilidades;

    public ListaDisponibilidades() {
        disponibilidades = new LinkedList<Disponibilidad>();
    }

    public void agregarDisponibilidad(Disponibilidad disponibilidad) {
        disponibilidades.add(disponibilidad);
    }

}
