import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        // Introducción
        int n;
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String cadena = "";
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Desarrollo
        System.out.print("Ingrese la longitud de la cadena aleatoria: ");
        n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Error: la longitud debe ser un número positivo.");
        } else {
            for (int i = 0; i < n; i++) {
                int indice = random.nextInt(caracteres.length());
                cadena += caracteres.charAt(indice);
            }
            // Final
            System.out.println("Cadena aleatoria generada: " + cadena);
        }

    }
}

