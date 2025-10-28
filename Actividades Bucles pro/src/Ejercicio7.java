import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        // Introducción
        int N;
        Scanner sc = new Scanner(System.in);

        // Desarrollo
        System.out.print("Ingrese un número N: ");
        N = sc.nextInt();
        if (N <= 0) {
            System.out.println("Error: N debe ser un número positivo.");
        } else {
            System.out.println("Números del 1 al " + N + ":");
            for (int i = 1; i <= N; i++) {
                System.out.print(i + " ");
            }
        }

    }
}

