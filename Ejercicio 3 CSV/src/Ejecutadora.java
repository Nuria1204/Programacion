import java.util.Scanner;

public class Ejecutadora {
    static void main() {
        String ruta= "C:\\Users\\1DAW\\IdeaProjects\\Ejercicio 3 CSV\\src\\datos.csv";
        String datos= "nombre, edad, ciudad";
        Escribir.Escribir(ruta, datos);
        String opcion = null;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime el nombre");
            String nombre = sc.nextLine();
            System.out.println("Dime la edad");
            String edad = sc.nextLine();
            System.out.println("Dime la cuidad");
            String cuidad = sc.nextLine();
            System.out.println("Quieres seguir ? S/N ");
            opcion = sc.nextLine();
            datos = nombre + "" + edad + "" + cuidad + "";
            Escribir.Escribir(ruta, datos);
        }while (opcion.equals("S"));
    }

}
