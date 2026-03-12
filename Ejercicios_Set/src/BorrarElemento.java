import java.util.HashSet;
import java.util.Set;

public class BorrarElemento {
    static void main() {
        Set<String> ciudades = new HashSet<>();

        ciudades.add("Granada");
        ciudades.add("Madrid");
        ciudades.add("Málaga");
        ciudades.add("Sevilla");
        System.out.println(ciudades);

        ciudades.remove("Granada");
        System.out.println("\nConjunto después de eliminar: " );
        System.out.println(ciudades);
    }
}