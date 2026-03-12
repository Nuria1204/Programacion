import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Traductor {
    static void main() {
        Map<String, String> diccionario = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        diccionario.put("hola", "hello");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");

        System.out.println("Escribe una palabra en español:");
        String palabra = sc.nextLine();

        if (diccionario.containsKey(palabra)) {
            System.out.println("Traduccion: " + diccionario.get(palabra));
        } else {
            System.out.println("Palabra no encontrada.");
        }
    }
}

