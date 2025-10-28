import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        // Introducción
        int dia, mes, anio;
        boolean fechaValida = true;
        int diasDelMes = 0;

        Scanner sc = new Scanner(System.in);

        // Desarrollo
        System.out.print("Ingrese el día: ");
        dia = sc.nextInt();

        System.out.print("Ingrese el mes (1-12): ");
        mes = sc.nextInt();

        System.out.print("Ingrese el año: ");
        anio = sc.nextInt();

        boolean esBisiesto;

        // Verificar si el año es bisiesto
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            esBisiesto = true;
        } else {
            esBisiesto = false;
        }

        // Determinar los días del mes
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasDelMes = 31;
                break;
            case 4: case 6: case 9: case 11:
                diasDelMes = 30;
                break;
            case 2:
                if (esBisiesto) {
                    diasDelMes = 29;
                } else {
                    diasDelMes = 28;
                }
                break;
            default:
                fechaValida = false; // mes inválido
                break;
        }

        // Validamos  el día
        if (fechaValida) {
            if (dia < 1 || dia > diasDelMes) {
                fechaValida = false;
            }
        }

        // Final
        if (fechaValida) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es válida.");
            if (esBisiesto) {
                System.out.println("El año " + anio + " es bisiesto.");
            } else {
                System.out.println("El año " + anio + " no es bisiesto.");
            }
        } else {
            System.out.println("La fecha ingresada no es válida.");
        }

    }
}
