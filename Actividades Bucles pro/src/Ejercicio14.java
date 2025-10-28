import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        // Introducción
        Scanner sc = new Scanner(System.in);
        String cadena, nuevaCadena = "";

        // Desarrollo
        System.out.print("Ingrese una cadena: ");
        cadena = sc.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isUpperCase(c)) {
                nuevaCadena += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                nuevaCadena += Character.toUpperCase(c);
            } else {
                nuevaCadena += c; // mantiene espacios y símbolos
            }
        }

        // Final
        System.out.println("Cadena con el caso cambiado: " + nuevaCadena);
    }
}

