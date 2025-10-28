import java.util.Scanner;

public class Ejercicio3 {
    static void main() {

        //Introducción
        double nota1, nota2, nota3, nota4, nota5;
        double promedio;
        String calificacion;
        Scanner sc = new Scanner(System.in);

        //Desarrollo
        System.out.println("Ingrese las notas de 5 materias (de 0 a 100): ");
        System.out.print("Nota 1: ");
        nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        nota3 = sc.nextDouble();
        System.out.print("Nota 4: ");
        nota4 = sc.nextDouble();
        System.out.print("Nota 5: ");
        nota5 = sc.nextDouble();
        // Validación: si alguna nota es inválida
        if (nota1 < 0 || nota1 > 100 || nota2 < 0 || nota2 > 100 ||
                nota3 < 0 || nota3 > 100 || nota4 < 0 || nota4 > 100 ||
                nota5 < 0 || nota5 > 100) {
            System.out.println("Error: Las notas deben estar entre 0 y 100.");
            sc.close();
            return;
        }
        promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        if (promedio >= 90) {
            calificacion = "A";
        } else if (promedio >= 80) {
            calificacion = "B";
        } else if (promedio >= 70) {
            calificacion = "C";
        } else if (promedio >= 60) {
            calificacion = "D";
        } else {
            calificacion = "F";
        }

        // Final
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación final: " + calificacion);







    }


}
