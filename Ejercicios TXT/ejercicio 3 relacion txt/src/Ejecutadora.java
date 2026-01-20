import java.io.IOException;
import java.util.Scanner;

public class Ejecutadora {
    public static void main(String[] args) {

        String origen = "C:\\Users\\1DAW\\Desktop\\Archivostxt\\archivo1.txt";
        String destino = "C:\\Users\\1DAW\\Desktop\\Archivostxt\\archivo2.txt";
        String contenido = LeerTXT.leer(origen);
        EscribirTXT.escribir(destino, contenido);
        System.out.println("Archivo copiado");



    }
}