import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class OrdenarAlfabeticamente {
    static void main() {
        HashSet<String> nombres = new HashSet<>();

        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Beatriz");

        ArrayList<String> lista = new ArrayList<>(nombres);
        Collections.sort(lista);   // Ordenar alfabéticamente

        System.out.println("Lista ordenada:");
        System.out.println(lista);
    }
}
