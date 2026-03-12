import java.util.HashMap;
import java.util.Map;
public class PaisesyCapitales {
    static void main() {
        Map<String, String> paises = new HashMap<>();

        paises.put("España", "Madrid");
        paises.put("Francia", "Paris");
        paises.put("Italia", "Roma");
        paises.put("Alemania", "Berlin");
        paises.put("Portugal", "Lisboa");

        System.out.println("Paises y capitales:");

        for (Map.Entry<String, String> entrada : paises.entrySet()) {
            System.out.println("Pais: " + entrada.getKey() + " - Capital: " + entrada.getValue());
        }
    }
}
