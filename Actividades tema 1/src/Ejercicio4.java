import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){

    //Introduccion

     int A= 1;
     int B= 2;
     int C= 3;
     int aux;
     Scanner juan= new Scanner(System.in);

    //Desarrollo

    System.out.println("Antes del cambio");
    System.out.println ("A="+ A+ ",B="+B +",C="+C);
    aux=C;
    C=B;
    B=A;
    A= aux;

   //Final
    System.out.println("Despues del cambio");
    System.out.println ("A="+ A+ ",B="+B +",C="+C);

    }


}

