import java.util.*;
public class NotasEstudiantes {
    static void main() {
        Map<String, ArrayList<Integer>> estudiantes = new HashMap<>();

        ArrayList<Integer> notasJuan = new ArrayList<>();
        notasJuan.add(7);
        notasJuan.add(8);
        notasJuan.add(6);
        estudiantes.put("Juan", notasJuan);

        for (Map.Entry<String, ArrayList<Integer>> entrada : estudiantes.entrySet()) {

            String nombre = entrada.getKey();
            ArrayList<Integer> notas = entrada.getValue();

            int suma = 0;

            for (int nota : notas) {
                suma += nota;
            }
            double promedio = suma / notas.size();

            System.out.println(nombre + " promedio: " + promedio);
        }
    }
}

