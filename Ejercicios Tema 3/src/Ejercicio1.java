import java.util.Scanner;

public class Ejercicio1 {
    static void main() {

        //Introducción
        String usuario;
        String contrasena;
        Scanner sc= new Scanner(System.in);

        //Desarrollo
        System.out.print("Ingrese su nombre de usuario: ");
        usuario= sc.nextLine();
        System.out.print("Ingrese su contraseña: ");
        contrasena= sc.nextLine();
        if (usuario.equals("admin") && contrasena.equals("1234")) {
            System.out.println("Bienvenido, Administrador. Nivel de acceso: 1");
        } else if (usuario.equals("user") && contrasena.equals("abcd")) {
            System.out.println("Bienvenido, Usuario normal. Nivel de acceso: 2");
        } else if (usuario.equals("guest") && contrasena.equals("xyz")) {
            System.out.println("Bienvenido, Invitado. Nivel de acceso: 3");
        } else {
            System.out.println("Acceso denegado.");
        }



    }
}
