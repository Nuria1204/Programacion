import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        // Introducción
        String texto;
        int contadorVocales = 0;
        Scanner sc = new Scanner(System.in);

        // Desarrollo
        System.out.print("Ingrese una cadena: ");
        texto = sc.nextLine();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
        }

        // Final
        System.out.println("Número de vocales en la cadena: " + contadorVocales);

    }
}

