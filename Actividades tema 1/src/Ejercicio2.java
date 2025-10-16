import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Introduccion
        int dato1;
        int dato2;
        int dato3;
        int dato4;
        double resultadosuma;
        double resultadomultiplicacion;
        double resultadomedia;
        Scanner juan = new Scanner(System.in);

        // Desarrollo
        System.out.println("Introduce los datos");
        dato1 = juan.nextInt();
        dato2 = juan.nextInt();
        dato3 = juan.nextInt();
        dato4 = juan.nextInt();
        resultadosuma= dato1+ dato2+ dato3+ dato4;
        resultadomultiplicacion= dato1* dato2* dato3* dato4;
        resultadomedia= (dato1+ dato2+ dato3+ dato4)/4;

        //Final
        System.out.println("El resultado de la suma es:" + resultadosuma);
        System.out.println("El resultado de la multiplicacion es:" + resultadomultiplicacion);
        System.out.println("El resultado de la media es:" + resultadomedia);


    }
}


