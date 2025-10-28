import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        // Introducción
        double ingresos, impuesto, tasaImpuesto;
        int dependientes;
        Scanner sc = new Scanner(System.in);

        // Desarrollo
        System.out.print("Ingrese sus ingresos anuales: ");
        ingresos = sc.nextDouble();
        System.out.print("Ingrese el número de dependientes: ");
        dependientes = sc.nextInt();

        // Determinar la tasa de impuestos
        if (ingresos < 20000) {
            tasaImpuesto = 0.05;           // 5%
        } else if (ingresos < 40000) {
            tasaImpuesto = 0.10;           // 10%
        } else if (ingresos < 80000) {
            tasaImpuesto = 0.20;           // 20%
        } else {
            tasaImpuesto = 0.30;           // 30%
        }

        // Si tienen más de 3 dependientes, se reduce el impuesto en un 5%
        if (dependientes > 3) {
            tasaImpuesto -= 0.05;      // reducción de 5%
            if (tasaImpuesto < 0) {
                tasaImpuesto = 0;     // por seguridad, que nunca sea negativa
            }
        }
        impuesto = ingresos * tasaImpuesto;

        // Final
        System.out.println("Tasa de impuesto aplicada: " + (tasaImpuesto * 100) + "%");
        System.out.println("Impuesto total a pagar: " + impuesto + " €");

    }
}

