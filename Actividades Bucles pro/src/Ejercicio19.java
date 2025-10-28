import java.util.Random;

public class Ejercicio19 {
    public static void main(String[] args) {
        // Introducción
        Random random = new Random();
        int suma = 0;
        int cantidad = 10;

        // Desarrollo
        System.out.println("Generando 10 números aleatorios entre 1 y 100...");
        for (int i = 1; i <= cantidad; i++) {
            int numero = random.nextInt(100) + 1; // genera número entre 1 y 100
            System.out.println("Número " + i + ": " + numero);
            suma += numero;
        }
        double media = (double) suma / cantidad;

        // Final
        System.out.println("La media de los números generados es: " + media);
    }
}

