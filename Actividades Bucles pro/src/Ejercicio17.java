import java.util.Random;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {

        // Introducción
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(10) + 1; // Número entre 1 y 10
        int intento;

        // Desarrollo
        System.out.println("¡Adivina el número entre 1 y 10!");

        do {
            System.out.print("Ingresa tu número: ");
            intento = sc.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("Demasiado bajo. Intenta otra vez.");
            } else if (intento > numeroSecreto) {
                System.out.println("Demasiado alto. Intenta otra vez.");
            }

        } while (intento != numeroSecreto);

        // Final
        System.out.println("¡Correcto! El número era " + numeroSecreto + ".");
    }
}

