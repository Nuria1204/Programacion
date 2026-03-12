import java.util.HashSet;
import java.util.Set;

public class InterseccionSet {
    static void main() {
        Set<String> conjunto1 = new HashSet<>();
        conjunto1.add("Madrid");
        conjunto1.add("Barcelona");
        conjunto1.add("Valencia");

        Set<String> conjunto2 = new HashSet<>();
        conjunto2.add("Sevilla");
        conjunto2.add("Valencia");
        conjunto2.add("Madrid");

        conjunto1.retainAll(conjunto2); //retainAll limina los que no coinciden y deja solo los comunes.
        System.out.println("Elementos comunes:");
        System.out.println(conjunto1);
    }
}
