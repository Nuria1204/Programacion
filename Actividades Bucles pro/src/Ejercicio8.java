import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        // Introducción
        int numeroSecreto;
        int intento;
        int intentos = 0;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        numeroSecreto = random.nextInt(100) + 1;
        System.out.println(" ¡Adivina el número entre 1 y 100!");

        // Desarrollo
        do {
            System.out.print("Introduce tu intento: ");
            intento = sc.nextInt();
            intentos++;

            if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor. 📈");
            } else if (intento > numeroSecreto) {
                System.out.println("El número secreto es menor. 📉");
            } else {
                System.out.println("-----------------------------");
                System.out.println("🎉 ¡Correcto! El número era " + numeroSecreto + ".");
                System.out.println("Lo adivinaste en " + intentos + " intentos.");
            }

        } while (intento != numeroSecreto);
    }
}

