import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        // Introducción
        String texto;
        boolean esPalindromo = true;
        Scanner sc = new Scanner(System.in);

        // Desarrollo
        System.out.print("Ingrese una cadena: ");
        texto = sc.nextLine();
        int longitud = texto.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (texto.charAt(i) != texto.charAt(longitud - 1 - i)) {
                esPalindromo = false;
                break; // No es necesario seguir revisando
            }
        }

        // Final
        if (esPalindromo) {
            System.out.println("La cadena es un palíndromo ✅");
        } else {
            System.out.println("La cadena no es un palíndromo ❌");
        }

    }
}

