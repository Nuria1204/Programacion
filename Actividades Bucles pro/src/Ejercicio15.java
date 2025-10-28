import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        // Introducción
        Scanner sc = new Scanner(System.in);
        int numero;
        int contador = 0;

        // Desarrollo
        System.out.print("Ingrese un número entero: ");
        numero = sc.nextInt();

        if (numero == 0) {
            contador = 1; // El número 0 tiene un dígito
        } else {
            if (numero < 0) {
                numero = -numero; // Convertimos a positivo si es negativo
            }

            while (numero > 0) {
                numero = numero / 10; // Eliminamos el último dígito
                contador++;
            }
        }

        // Final
        System.out.println("El número tiene " + contador + " dígito(s).");
    }
}

