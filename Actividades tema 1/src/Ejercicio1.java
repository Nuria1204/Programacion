import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Introduccion
        double pi = 3.14;
        double radio;
        double area, perimetro;
        Scanner juan = new Scanner(System.in);

        //Desarrollo
        System.out.println("Dime el radio:");
        radio = juan.nextDouble();
        area = pi * radio * radio;
        perimetro = 2 * pi * radio;

        //Final
        System.out.println("El area es:" + area);
        System.out.println("El perimetro es:" + perimetro);
    }
}
