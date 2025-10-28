import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        // Introducción
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;

        // Desarrollo
        System.out.print("Ingrese un número entero: ");
        numero = sc.nextInt();

        if (numero < 0) {
            numero = -numero; // Convertimos a positivo si es negativo
        }

        while (numero > 0) {
            int digito = numero % 10; // Obtiene el último dígito
            suma += digito;            // Lo suma al total
            numero = numero / 10;      // Elimina el último dígito
        }

        // Final
        System.out.println("La suma de los dígitos es: " + suma);
    }
}

