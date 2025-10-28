import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        // Introducción
        double num1, num2, resultado = 0;
        String operacion;
        boolean error = false;
        Scanner sc = new Scanner(System.in);

        // Desarrollo
        System.out.println("Operaciones disponibles: +, -, *, /, potencia, raiz, factorial");
        System.out.print("Ingrese la operación que desea realizar: ");
        operacion = sc.next();
        switch (operacion) {
            case "+":
                System.out.print("Ingrese el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = sc.nextDouble();
                resultado = num1 + num2;
                break;

            case "-":
                System.out.print("Ingrese el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = sc.nextDouble();
                resultado = num1 - num2;
                break;

            case "*":
                System.out.print("Ingrese el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = sc.nextDouble();
                resultado = num1 * num2;
                break;

            case "/":
                System.out.print("Ingrese el dividendo: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese el divisor: ");
                num2 = sc.nextDouble();
                if (num2 == 0) {
                    System.out.println("Error: no se puede dividir entre cero.");
                    error = true;
                } else {
                    resultado = num1 / num2;
                }
                break;

            case "potencia":
                System.out.print("Ingrese la base: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese el exponente: ");
                num2 = sc.nextDouble();
                if (num2 < 0) {
                    System.out.println("Error: el exponente no puede ser negativo.");
                    error = true;
                } else {
                    resultado = Math.pow(num1, num2);
                }
                break;

            case "raiz":
                System.out.print("Ingrese el número: ");
                num1 = sc.nextDouble();
                if (num1 < 0) {
                    System.out.println("Error: no se puede calcular la raíz cuadrada de un número negativo.");
                    error = true;
                } else {
                    resultado = Math.sqrt(num1);
                }
                break;

            case "factorial":
                System.out.print("Ingrese un número entero positivo: ");
                int n = sc.nextInt();
                if (n < 0) {
                    System.out.println("Error: no existe el factorial de un número negativo.");
                    error = true;
                } else {
                    long factorial = 1;
                    for (int i = 1; i <= n; i++) {
                        factorial *= i;
                    }
                    resultado = factorial;
                }
                break;

            default:
                System.out.println("Operación no válida.");
                error = true;
                break;
        }

        // Final
        if (!error) {
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("No se pudo calcular el resultado debido a un error.");
        }

    }
}

