import java.util.HashMap;
import java.util.Map;
public class Inventario {
    static void main() {
        Map<String, Integer> inventario = new HashMap<>();

        inventario.put("Manzanas", 10);
        inventario.put("Pan", 20);
        inventario.put("Leche", 15);
        inventario.put("Pan", 25); // actualizar
        inventario.remove("Leche");

        for (Map.Entry<String, Integer> entrada : inventario.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}

