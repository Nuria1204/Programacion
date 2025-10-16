import java.util.Scanner;

public class Ejecicio1 {
    public static void main(String[] args) {

        //Introduccion
        double pi=3.14;
        double radio;
        double  area, perimetro;
        Scanner sc= new Scanner(System.in);

        //Desarrollo
        System.out.println("Dime el radio");
        radio= sc.nextDouble();
        area= pi* radio*radio;
        perimetro= 2* pi* radio;

        //Final
        System.out.println("El radio es:"+ area);
        System.out.println("El radio es:"+ perimetro);



    }


}
