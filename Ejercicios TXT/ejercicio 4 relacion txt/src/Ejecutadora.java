import java.util.Scanner;

public class Ejecutadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la frase que quiera");
        String texto = sc.nextLine();
        String ruta = "C:\\Users\\1DAW\\Desktop\\Archivostxt\\archivo1.txt";
        EscribirTXT.escribir(ruta, texto, true);
        System.out.println("La frase ha sido añadida a tu documento");
        sc.close();
    }
}