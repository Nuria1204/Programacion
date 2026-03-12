import java.util.LinkedHashSet;
import java.util.Random;

public class NumerosAleatorios {
    static void main() {
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
        Random random = new Random();

        while (numeros.size() < 10) {
            int num = random.nextInt(20) + 1;
            numeros.add(num);
        }

        System.out.println("Números sin duplicados:");
        System.out.println(numeros);
    }
}

