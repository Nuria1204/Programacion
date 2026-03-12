import java.util.ArrayList;
import java.util.HashSet;

public class CantidadElemento {
    static void main() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Luis");

        HashSet<String> conjuntoLista = new HashSet<>(lista);
        System.out.println("Cantidad de elementos no repetidos: " +conjuntoLista.size());

    }
}
