import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        //Introducción
         int hora1;
         int minutos1;
         int segundos1;
         int hora2;
         int minutos2;
         int segundos2;
         int tiempo1;
         int tiempo2;
         int horas;
         int minutos;
         int segundos;
         int diferencia;
         Scanner sc= new Scanner(System.in);

         //Desarrollo
        System.out.println("Introduce el primer instante:");
        System.out.print("Horas: ");
        hora1 = sc.nextInt();
        System.out.print("Minutos: ");
        minutos1 = sc.nextInt();
        System.out.print("Segundos: ");
        segundos1 = sc.nextInt();

        System.out.println("Introduce el segundo instante:");
        System.out.print("Horas: ");
        hora2 = sc.nextInt();
        System.out.print("Minutos: ");
        minutos2 = sc.nextInt();
        System.out.print("Segundos: ");
        segundos2 = sc.nextInt();

        tiempo1= hora1* 3600 + minutos1 * 60 + segundos1;
        tiempo2= hora2* 3600 + minutos2 * 60 + segundos2;
        diferencia= tiempo2 - tiempo1;
        horas= diferencia / 3600;
        minutos= (diferencia % 3600) / 60;
        segundos= diferencia % 60;

        //Final
        System.out.println("La diferencia es:" + horas + "horas," + minutos + "minutos," + segundos + "segundos.");


    }
}

