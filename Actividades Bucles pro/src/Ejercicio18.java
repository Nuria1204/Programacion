import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        // Introducción
        Scanner sc = new Scanner(System.in);
        String cadena;
        int contadorConsonantes = 0;

        // Desarrollo
        System.out.println("Programa para contar consonantes en una cadena.");
        System.out.print("Ingresa una frase o palabra: ");
        cadena = sc.nextLine().toLowerCase(); // pasamos todo a minúsculas

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            // Si es letra y no es vocal, se cuenta como consonante
            if (Character.isLetter(c) && !"aeiou".contains(String.valueOf(c))) {
                contadorConsonantes++;
            }
        }

        // Final
        System.out.println("La cadena tiene " + contadorConsonantes + " consonantes.");

    }
}

