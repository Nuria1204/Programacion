import java.util.HashSet;
import java.util.Set;

public class ListaNombres {
    static void main() {
        Set<String> nombre = new HashSet<>();

        nombre.add("Antonio");
        nombre.add("Carla");
        nombre.add("Mario");
        nombre.add("María");

        System.out.println(nombre);
    }
}
