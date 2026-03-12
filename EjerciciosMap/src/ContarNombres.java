import java.util.HashMap;
import java.util.Map;

public class ContarNombres {
    static void main() {
        String[] nombres = {"Ana", "Luis", "Ana", "Pedro", "Luis"};
        Map<String, Integer> contador = new HashMap<>();

        for (String nombre : nombres) {

            if (contador.containsKey(nombre)) {
                contador.put(nombre, contador.get(nombre) + 1);
            } else {
                contador.put(nombre, 1);
            }
        }

        for (Map.Entry<String, Integer> entrada : contador.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}

