import java.util.Scanner;

 public class Ejercicio1 {
     static void main() {

    //Introducción
    String texto;
    int contador= 0;
    Scanner sc= new Scanner(System.in);

    //Desarrollo
    System.out.print("Introducce cadena de texto");
    texto = sc.nextLine();
    for (int i=0; i < texto.length(); i++){           //length es una función para contar los caracteres
        contador++;
    }

    //Conclusión
    System.out.print("La cadena tiene " + contador + " caracteres.");



     }
}
