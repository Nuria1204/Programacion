import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

    //Introduccion
    int horas;
    int minutos;
    int segundos;
    int totalsegundos;
    Scanner juan= new Scanner(System.in);

    //Desarrollo
    System.out.println("Introduce los segundos");
    totalsegundos= juan.nextInt();
    horas= totalsegundos/3600;
    minutos= (totalsegundos % 3600) / 60; // % es el resto de la division
    segundos= totalsegundos % 60;

    //Final
    System.out.println(totalsegundos+ "segundos son:"+ horas + "horas"+ minutos+ "minutos"+ segundos+ "segundos");





    }
}