import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        // Introducción
        String texto;
        int contadorPalabras = 0;
        Scanner sc = new Scanner(System.in);

        // Desarrollo
        System.out.print("Ingrese una cadena de texto: ");
        texto = sc.nextLine();
        if (texto.isEmpty()) {
            System.out.println("No se ingresó texto.");
        } else {
            boolean dentroDePalabra = false;

            for (int i = 0; i < texto.length(); i++) {
                char c = texto.charAt(i);

                if (c != ' ' && !dentroDePalabra) {
                    dentroDePalabra = true;
                    contadorPalabras++;
                } else if (c == ' ') {
                    // Fin de una palabra
                    dentroDePalabra = false;
                }
            }
        }
        // Final
        System.out.println("Número total de palabras: " + contadorPalabras);
    }
}

