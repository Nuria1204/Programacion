import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        // Introducción
        double[] calificaciones = new double[6];
        double[] pesos = new double[6];
        double sumaPesos = 0;
        double promedioPonderado = 0;
        Scanner sc = new Scanner(System.in);

        // Desarrollo
        System.out.println("Ingrese las calificaciones y sus pesos porcentuales para 6 materias:");

        for (int i = 0; i < 6; i++) {
            System.out.print("Materia " + (i + 1) + " - Calificación (0 a 100): ");
            calificaciones[i] = sc.nextDouble();

            System.out.print("Materia " + (i + 1) + " - Peso (%): ");
            pesos[i] = sc.nextDouble();
            if (calificaciones[i] < 0 || calificaciones[i] > 100) {
                System.out.println("Error: la calificación debe estar entre 0 y 100.");
                sc.close();
                return; // finalizar el programa
            }
            if (pesos[i] < 0) {
                System.out.println("Error: el peso no puede ser negativo.");
                sc.close();
                return; // finalizar el programa
            }
            sumaPesos += pesos[i];
        }
        if (sumaPesos != 100) {
            System.out.println("-----------------------------");
            System.out.println("Error: la suma de los pesos debe ser igual a 100%.");
        } else {
            // Calcular el promedio
            for (int i = 0; i < 6; i++) {
                promedioPonderado += calificaciones[i] * (pesos[i] / 100);
            }

            System.out.println("Promedio ponderado: " + promedioPonderado + "%");

            if (promedioPonderado < 60) {
                System.out.println("Resultado: Suspenso ❌");
            } else {
                System.out.println("Resultado: Aprobado ✅");
            }
        }

    }
}


