import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ContarPalabras {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> palabras = new HashMap<>();

        System.out.println("Escribe una frase:");
        String frase = sc.nextLine();

        String[] lista = frase.split(" ");

        for (String palabra : lista) {

            if (palabras.containsKey(palabra)) {
                palabras.put(palabra, palabras.get(palabra) + 1);
            } else {
                palabras.put(palabra, 1);
            }
        }

        System.out.println("\nFrecuencia de palabras:");

        for (Map.Entry<String, Integer> entrada : palabras.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}

