import java.util.TreeSet;

public class VerificarSubconjunto {
    static void main() {
        TreeSet<Integer> numeros1 = new TreeSet<>();
        numeros1.add(1);
        numeros1.add(2);
        numeros1.add(3);
        numeros1.add(4);

        TreeSet<Integer> numeros2 = new TreeSet<>();
        numeros2.add(2);
        numeros2.add(3);

        if (numeros1.containsAll(numeros2)) {
            System.out.println("Es un subconjunto.");
        } else {
            System.out.println("No es un subconjunto.");
        }

    }
}
