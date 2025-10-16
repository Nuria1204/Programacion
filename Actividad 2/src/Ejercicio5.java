import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        //Introduccion
        int x;
        int resultado;
        Scanner sc= new Scanner(System.in);

        //Desarrollo
        System.out.println("Introduce un número entero para x:");
        x= sc.nextInt();
        int x2= x * x;
        int x3= x2 * x;
        int x4= x3* x;
        int x5= x4 * x;
        resultado= x5 + 7 * x4 - 4 * x3 + 2 * x2 - x +10;

        //Final
        System.out.println("El resultado de f(x) es:" + resultado);

    }
}
