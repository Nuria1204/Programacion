import java.util.HashMap;
import java.util.Map;
public class AgendaMovil {
    static void main() {

        Map<String, String> agenda = new HashMap<>();
        agenda.put("Juan", "123456");
        agenda.put("Ana", "654321");
        agenda.put("Luis", "987654");

        System.out.println("Contactos:");

        for (Map.Entry<String, String> entrada : agenda.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
        String buscar = "Ana";

        if (agenda.containsKey(buscar)) {
            System.out.println("\nTelefono de " + buscar + ": " + agenda.get(buscar));
        }
    }
}

