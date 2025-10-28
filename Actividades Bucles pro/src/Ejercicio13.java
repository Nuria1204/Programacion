import java.util.Random;

public class Ejercicio13 {
    public static void main(String[] args) {

        // Introducción
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contrasena = "";
        Random random = new Random();

        // Desarrollo
        for (int i = 0; i < 8; i++) {
            int indice = random.nextInt(caracteres.length());
            contrasena += caracteres.charAt(indice);
        }

        // Final
        System.out.println("Contraseña aleatoria generada: " + contrasena);
    }
}

