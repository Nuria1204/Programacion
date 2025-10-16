import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        //Introduccion
        int partidoganado;
        int partidoempatado;
        int partidoperdido;
        double totalpartidos;
        Scanner sc=new Scanner(System.in);

        //Desarrollo
        System.out.println("Introduce numero partidos ganados");
        partidoganado= sc.nextInt();
        System.out.println("Introduce numero partidos empatados");
        partidoempatado= sc.nextInt();
        System.out.println("Introduce numero partidos perdidos");
        partidoperdido= sc.nextInt();
        totalpartidos= (partidoganado*3 )+ (partidoempatado *1) + (partidoperdido *0);

        //Final
        System.out.println("Los puntos totales son:" + totalpartidos + "puntos");


    }
}

