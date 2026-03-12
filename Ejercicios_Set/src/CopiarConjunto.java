import java.util.HashSet;

public class CopiarConjunto {
    static void main() {

        HashSet<String> conjunto1 = new HashSet<>();
        conjunto1.add("Madrid");
        conjunto1.add("Barcelona");
        conjunto1.add("Valencia");

        HashSet<String> conjunto2 = new HashSet<>();
        conjunto2.addAll(conjunto1);

        System.out.println("Conjunto copiado:");
        System.out.println(conjunto2);
    }
}




