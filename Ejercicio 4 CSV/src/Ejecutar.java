import java.util.Scanner;

public class Ejecutar {
    static void main() {
        String ruta = "C:\\Users\\1DAW\\IdeaProjects\\Ejercicio 4 CSV\\src\\datos 2.csv";
        String datos= "c.postal, móvil, apellido";
        Escribir.SobreEscribir(ruta,datos);
        String opcion= null;

        do{
            Scanner sc= new Scanner(System.in);
            System.out.println("Dime tú apellido");
            String apellido= sc.nextLine();
            System.out.println("Dime tú C.postal");
            String postal = sc.nextLine();
            System.out.println("Dime tu móvil");
            String movil = sc.nextLine();
            System.out.println("Quieres seguir ? S/N ");
            opcion = sc.nextLine();
            datos = apellido + "," + postal + "," + movil + ",";
            Escribir.SobreEscribir(ruta,datos);
        }while (opcion.equals("S"));
   }
}
