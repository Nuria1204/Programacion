import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        // Introducción
        int numero;
        int sumaDivisores = 0;
        Scanner sc = new Scanner(System.in);

        // Desarrollo
        System.out.print("Ingrese un número entero positivo: ");
        numero = sc.nextInt();
        if (numero <= 0) {
            System.out.println("Error: el número debe ser positivo.");
        } else {
                   // Calcular la suma de los divisores del número
            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    sumaDivisores += i;
                }
            }
            if (sumaDivisores == numero) {
                System.out.println("-----------------------------");
                System.out.println("El número " + numero + " es un número perfecto.");
            } else {
                System.out.println("-----------------------------");
                System.out.println("El número " + numero + " no es un número perfecto.");
            }
        }

    }
}

