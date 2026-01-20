import java.util.Scanner;

public class Ejecutadora {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ruta = "C:\\Users\\1DAW\\Desktop\\Archivostxt\\archivo1.txt";
        System.out.println("Introduce la palabra que deseas buscar");
        String palabra = sc.nextLine();
        LeerTXT.leer(ruta, palabra);
        sc.close();

    }
}