import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        // Introducción
        double lado1, lado2, lado3;
        String tipoTriangulo;
        boolean esValido;
        Scanner sc = new Scanner(System.in);

        // Desarrollo
        System.out.print("Ingrese la longitud del primer lado: ");
        lado1 = sc.nextDouble();
        System.out.print("Ingrese la longitud del segundo lado: ");
        lado2 = sc.nextDouble();
        System.out.print("Ingrese la longitud del tercer lado: ");
        lado3 = sc.nextDouble();

        // Verificar si las longitudes pueden formar un triángulo
        // (la suma de dos lados debe ser mayor que el tercero)
        if (lado1 > 0 && lado2 > 0 && lado3 > 0 &&
                lado1 + lado2 > lado3 &&
                lado1 + lado3 > lado2 &&
                lado2 + lado3 > lado1) {
            esValido = true;
        } else {
            esValido = false;
        }

        // Determinar el tipo de triángulo si es válido
        if (esValido) {
            if (lado1 == lado2 && lado2 == lado3) {
                tipoTriangulo = "Equilátero";
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                tipoTriangulo = "Isósceles";
            } else {
                tipoTriangulo = "Escaleno";
            }
        } else {
            tipoTriangulo = "Inválido";
        }

        // Final
        if (tipoTriangulo.equals("Inválido")) {
            System.out.println("Los lados ingresados no forman un triángulo válido.");
        } else {
            System.out.println("El triángulo es: " + tipoTriangulo);
        }

    }
}

