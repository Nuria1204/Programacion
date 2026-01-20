import java.io.File;
import java.util.Scanner;
import java.util.Scanner;

public class Ejecutadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rutaArchivo = "C:\\Users\\1DAW\\Desktop\\Archivostxt\\archivo2.txt";

        if (Archivo_existe.existe(rutaArchivo)) {
            System.out.println("Archivo encontrado.");
            System.out.println("¿Quieres borrarlo? Escriba S o N");
            String respuesta = sc.nextLine().toLowerCase();

            if (respuesta.equals("s")) {
                if (Archivo_existe.eliminar(rutaArchivo)) {
                    System.out.println("Archivo eliminado correctamente.");
                } else {
                    System.out.println("No se pudo eliminar el archivo.");
                }
            } else {
                System.out.println("No se eliminó el archivo.");
            }

        } else {
            System.out.println("Archivo no encontrado.");
        }
    }
}
