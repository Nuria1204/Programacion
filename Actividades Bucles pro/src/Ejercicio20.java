public class Ejercicio20 {
    public static void main(String[] args) {
        // Introducción
        System.out.println("Programa que muestra los múltiplos de 5 entre 1 y 100.");

        // Desarrollo
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) { // si el número es múltiplo de 5
                System.out.println(i);
            }
        }

        // Final
        System.out.println("Fin del programa. Esos fueron todos los múltiplos de 5 entre 1 y 100.");
    }
}

