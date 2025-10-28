import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        // Introducción
        int N;
        int suma = 0;
        Scanner sc = new Scanner(System.in);

        // Desarrollo
        System.out.print("Ingrese un número N: ");
        N = sc.nextInt();

        if (N < 1) {
            System.out.println("Error: N debe ser mayor o igual a 1.");
        } else {
            // Bucle para sumar los números pares
            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0) {  // si el número es par
                    suma += i;
                }
            }
        }
        // Final
        System.out.println("La suma de los números pares del 1 al " + N + " es: " + suma);
    }


}

