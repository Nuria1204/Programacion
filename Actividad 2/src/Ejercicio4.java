import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        //Introduccion
        double practica;
        double problemas;
        double teorica;
        double total;
        Scanner sc = new Scanner(System.in);

        //Desarrollo
        System.out.println("ntroduce los datos");
        practica = sc.nextDouble();
        problemas = sc.nextDouble();
        teorica = sc.nextDouble();
        total = (teorica* 0.10)+ (problemas* 0.50) + (practica* 0.40);

        //Final
        System.out.println("Parte teorica es: " + teorica + ", Parte problemas es: " + problemas + ", Parte practica es: " + practica);
        System.out.println("Nota final:" + total);
    }
}

