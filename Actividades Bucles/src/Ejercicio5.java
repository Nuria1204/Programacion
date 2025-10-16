import java.util.Scanner;

public class Ejercicio5 {
    static void main() {

        //Introduccion
        int numero=5;
        int resultado;
        Scanner sc= new Scanner(System.in);

        //Desarrollo y final
        System.out.println("Tabla del " + numero + ":");
        numero= sc.nextInt();
        for(int i =1; i<=10; i++){
            resultado= numero * i;
            System.out.println(numero + "x"+ i+ "=" + resultado);
        }

    }
}
