import java.util.Scanner;

public class Ejercicio2 {
    static void main() {

        //Introducción
        String texto;
        int contador= 0;
        char letra;
        Scanner sc= new Scanner(System.in);

        //Desarrollo
        System.out.print("Introduce una cadena");
        texto= sc.nextLine();
        System.out.print("Introduce una letra");
        letra= sc.next().charAt(0);   // Coge el caracter de la 1º posición
        for (int i= 0; i < texto.length(); i++){
            if (texto.charAt(i)== letra){
                contador++;
            }
        }

        //Conclusión
        System.out.print("La letra " + letra + " aparece " + contador + " veces en la cadena. ");

    }
}
