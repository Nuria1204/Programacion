import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        // Introducción
        String texto;
        String cadenaLarga = "";
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        // Desarrollo
        System.out.println("Ingrese cadenas de texto (escriba 'salir' para terminar):");

        while (true) {
            System.out.print("Cadena #" + (contador + 1) + ": ");
            texto = sc.nextLine();
            if (texto.equalsIgnoreCase("salir")) {
                break;
            } contador++;
            if (texto.length() > cadenaLarga.length()) {
                cadenaLarga = texto;
            }
        }

        // Final
        System.out.println("Número total de cadenas ingresadas: " + contador);

        if (contador > 0) {
            System.out.println("La cadena más larga es: \"" + cadenaLarga + "\"");
            System.out.println("Longitud: " + cadenaLarga.length() + " caracteres");
        } else {
            System.out.println("No se ingresaron cadenas.");
        }
    }
}

