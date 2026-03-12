import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ContarCaracteres {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> contador = new HashMap<>();

        System.out.println("Escribe una palabra:");
        String palabra = sc.nextLine();

        for (char c : palabra.toCharArray()) {

            if (contador.containsKey(c)) {
                contador.put(c, contador.get(c) + 1);
            } else {
                contador.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entrada : contador.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}

