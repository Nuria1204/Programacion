import java.util.HashSet;
import java.util.Set;

public class CombinarSet {
    static void main() {
        Set<String> conjunto1 = new HashSet<>();
        conjunto1.add("Madrid");
        conjunto1.add("Barcelona");
        conjunto1.add("Valencia");

        Set<String> conjunto2 = new HashSet<>();
        conjunto2.add("Sevilla");
        conjunto2.add("Valencia");  // Repetido
        conjunto2.add("Madrid");    // Repetido

        conjunto1.addAll(conjunto2);
        System.out.println("Conjunto combinado sin duplicados:");
        System.out.println(conjunto1);
    }
}


