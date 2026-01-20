import java.util.Scanner;

public class Ejecutadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Introduce un texto");
            String ruta = "C:\\Users\\1DAW\\Desktop\\Archivostxt\\archivo1.txt";
            EscribirFicheros.escribir(ruta, sc.nextLine());
            System.out.println("Archivo creado");
        } catch (Exception e) {
            throw  new RuntimeException(e);
        }


    }
}