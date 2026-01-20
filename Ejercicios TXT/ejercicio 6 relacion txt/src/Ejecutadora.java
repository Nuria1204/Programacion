import java.util.Scanner;

public class Ejecutadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la frase la cual quiera sobreescribir en el documento");
        String frase = sc.nextLine();
        String ruta = "C:\\Users\\1DAW\\Desktop\\Archivostxt\\archivo1.txt";
        EscribirTXT.escribir(ruta, frase, false);
        System.out.println("El documento ha sido sobreescrito");
        sc.close();
    }
}