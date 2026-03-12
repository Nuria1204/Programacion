import java.util.Map;
import java.util.TreeMap;
public class GestionEmpleados {
    static void main() {
        Map<Integer, String> empleados = new TreeMap<>();

        empleados.put(3, "Juan - 1500€");
        empleados.put(1, "Ana - 1800€");
        empleados.put(5, "Luis - 1600€");
        empleados.put(2, "Maria - 1700€");

        System.out.println("Lista de empleados ordenados por ID:");

        for (Map.Entry<Integer, String> entrada : empleados.entrySet()) {
            System.out.println("ID: " + entrada.getKey() + ", Datos: " + entrada.getValue());
        }
        int buscarID = 2;

        if (empleados.containsKey(buscarID)) {
            System.out.println("\nEmpleado encontrado: " + empleados.get(buscarID));
        } else {
            System.out.println("\nEmpleado no encontrado.");
        }

    }
}

