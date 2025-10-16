import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        //Introduccion
        int dias=5;
        int preciohora=12;
        int numeroshoras;
        double total;
        Scanner sc= new Scanner(System.in);

        //Desarrollo
        System.out.println("Introduce horas a la semana");
        numeroshoras= sc.nextInt();
        total= numeroshoras* preciohora;

        //Final
        System.out.println("El salario semanal es:"+ total+ "euros");



    }
}

