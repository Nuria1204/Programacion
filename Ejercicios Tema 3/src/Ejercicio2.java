import java.util.Scanner;

public class Ejercicio2 {
    static void main() {

        //Introducción
        double precio;
        double descuento;
        String cliente;
        double motoDescuento;
        double precioFinal;
        Scanner sc= new Scanner(System.in);

        //Desarrollo
        System.out.print("Ingrese el tipo de cliente (regular, premium, vip): ");
        cliente= sc.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        precio= sc.nextDouble();
        precioFinal= sc. nextDouble();
        switch (cliente) {
            case "regular":
                descuento = 0.05;     // 5%
                break;
            case "premium":
                descuento = 0.10;     // 10%
                break;
            case "vip":
                descuento = 0.20;      // 20%
                // Descuento adicional si el precio es mayor a 500
                if (precio > 500) {
                    descuento += 0.05;     // 5% adicional
                }
                break;
            default:
                System.out.println("Tipo de cliente no válido. No se aplica descuento.");
                break;
        }
        
    }
}
