import java.util.Scanner;

public  class Ejecutadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rutaLeer = "C:\\Users\\1DAW\\Desktop\\Archivostxt\\archivo1.txt";
        String rutaEscribir = "C:\\Users\\1DAW\\Desktop\\Archivostxt\\filtrado.txt";
        String contenido;
        
        System.out.println("Introduce la palabra para buscarte las lineas donde aparecen");
        String palabra = sc.nextLine();

        String lineaFiltrada = LeerTXT.leer(rutaLeer, palabra);
        EscribitTXT.escribir(rutaEscribir, lineaFiltrada, false);
        System.out.println("Archivo sobreescrito con su busqueda");
    }
}
