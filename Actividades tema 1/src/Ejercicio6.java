import java.util.Scanner;

public class

Ejercicio6 {
    public static void main(String[] args) {

        //Introuccion
        String numerosenteros;
        Scanner juan= new Scanner(System.in);

       //Desarrollo
        System.out.println("Introduce los numeros");
        numerosenteros= juan.nextLine();  // scaner lee la siguiente linea

        //Final
        System.out.println("Los numero separados son:");
        System.out.println(numerosenteros.charAt(0));
        System.out.println(numerosenteros.charAt(1));
        System.out.println(numerosenteros.charAt(2));
        System.out.println(numerosenteros.charAt(3));
        System.out.println(numerosenteros.charAt(4));
    }
}

