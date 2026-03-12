import java.util.HashMap;
import java.util.Map;
public class SistemaVotaciones {
    static void main() {
        Map<String, Integer> votos = new HashMap<>();
        votos.put("Carlos", 3);
        votos.put("Ana", 5);
        votos.put("Luis", 2);
        System.out.println("Resultados de la votacion:");

        for (Map.Entry<String, Integer> entrada : votos.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue() + " votos");
        }

        String ganador = "";
        int maxVotos = 0;

        for (Map.Entry<String, Integer> entrada : votos.entrySet()) {

            if (entrada.getValue() > maxVotos) {
                maxVotos = entrada.getValue();
                ganador = entrada.getKey();
            }
        }
        System.out.println("\nEl ganador es: " + ganador + " con " + maxVotos + " votos");

    }
}

