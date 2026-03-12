import java.util.TreeSet;

public class VaciaryComprobar {
    static void main() {
        TreeSet<String> ciudad = new TreeSet<>();

        ciudad.add("Madrid");
        ciudad.add("Barcelona");
        ciudad.add("Valencia");
        ciudad.clear();

        if (ciudad.isEmpty()) {  //isEmpty comprueba que esta vacio
            System.out.println("El conjunto está vacío.");
        } else {
            System.out.println("El conjunto NO está vacío.");
        }
    }
}


