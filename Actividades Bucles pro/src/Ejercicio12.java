import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        // Introducción
        Scanner sc = new Scanner(System.in);
        int opcion;

        // Desarrollo
        do {
            System.out.println("1. Contar caracteres de una cadena");
            System.out.println("2. Invertir una cadena");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese una cadena: ");
                    String texto1 = sc.nextLine();
                    System.out.println("Número de caracteres: " + texto1.length());
                    break;

                case 2:
                    System.out.print("Ingrese una cadena: ");
                    String texto2 = sc.nextLine();
                    String invertida = "";
                    for (int i = texto2.length() - 1; i >= 0; i--) {
                        invertida += texto2.charAt(i);
                    }
                    System.out.println("Cadena invertida: " + invertida);
                    break;

                case 3:
                    System.out.println("Saliendo del programa... 👋");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 3);
    }
}

