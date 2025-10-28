import java.util.Scanner;

public class Ejercicio3 {
    static void main() {

        //Introducción
        String texto;
        String invertida= "";       // sirve para guardar el texto al revés
        Scanner sc= new Scanner(System.in);

        //Desarrollo
        System.out.print("Introduce una cadena: ");
        texto= sc.nextLine();
        for (int i= texto.length() - 1; i> 0; i--) {
            invertida += texto.charAt(i);
        }

        //Final
        System.out.print("La cadena invertida es: " + invertida);

    }
}
