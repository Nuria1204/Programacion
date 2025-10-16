
import java.util.Random;
import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {

        //CON IDEA DE ORGANIZAR Y SEPARAR EL CODIGO
        //DEFINIR LAS VARIABLES (FINAL SI PROCEDE) NECESARIAS AQUI ARRIBA
        //%DEL IVA ... ETC
        //PRECIOS DE LOS PRODUCTOS NOMBRES DE LOS PRODUCTOS,ETC...
        //VARIABLES PARA EL DESCUENTO ALEATORIO

        //=====================================================================
        String articulo1, articulo2, articulo3, articulo4, articulo5;
        double precio1, precio2, precio3, precio4, precio5;
        String nombrecomleto;
        int cant1, cant2, cant3, cant4, cant5;
        double totalsinIVA;
        double cantidadIVA;
        double totalconIVA;
        int descuentoaleatorio;
        double descuento1ªvez;
        double totalfinal;
        final double IVA= 0.21;
        Random random= new Random();
        descuentoaleatorio= random.nextInt(6)+5;

        Scanner sc= new Scanner(System.in);
        //=====================================================================
        //ASIGNAR EL NOMBRE DE LOS PRODUCTOS

        articulo1= "Camiseta";
        articulo2= "Pantalón";
        articulo3= "Sudadera";
        articulo4= "Zapatillas";
        articulo5= "Gorra";
        //=====================================================================
        //ASIGNAR EL PRECIO DE LOS PRODUCTOS

        precio1= 12.50;
        precio2= 20.00;
        precio3= 35.99;
        precio4= 60.99;
        precio5= 10.90;
        //=====================================================================
        //IMPRIMIR EL MENSAJE DE BIENVENIDA
        System.out.println("*   ¡BIENVENIDO A MI TIENDA DE ROPA!   *");
        System.out.println("         (^_^) ¡Gracias por visitarnos!     ");
        //IMPRIMIR EL LOGOTIPO

        System.out.println("   ██████╗ ██╗   ██╗███████╗███████╗");
        System.out.println("   ██╔══██╗██║   ██║██╔════╝██╔════╝");
        System.out.println("   ██████╔╝██║   ██║█████╗  ███████╗");
        System.out.println("   ██╔══██╗██║   ██║██╔══╝  ╚════██║");
        System.out.println("   ██████╔╝╚██████╔╝███████╗███████║");
        System.out.println("   ╚═════╝  ╚═════╝ ╚══════╝╚══════╝");
        //=====================================================================
        //IMPRIMIR TABLA DE PRODUCTOS CON SUS PRECIOS

        System.out.println("======================================");
        System.out.println("     LISTA DE PRECIOS     ");
        System.out.println("======================================");
        System.out.printf("%-15s %10s%n", "Artículo", "Precio (€)");
        System.out.println("--------------------------------------");
        System.out.printf("%-15s %10.2f%n", articulo1, precio1);
        System.out.printf("%-15s %10.2f%n", articulo2, precio2);
        System.out.printf("%-15s %10.2f%n", articulo3, precio3);
        System.out.printf("%-15s %10.2f%n", articulo4, precio4);
        System.out.printf("%-15s %10.2f%n", articulo5, precio5);
        System.out.println("======================================");
        //=====================================================================
        //PEDIR LA CANTIDAD QUE EL CLIENTE QUIERE COMPRAR DE CADA PRODUCTO
        //SUPONEMOS QUE EL CLIENTE NO ESCRIBE NUMEROS NEGATIVOS

        System.out.print("¿Cuántas " + articulo1 + " desea?:");
        cant1= sc.nextInt();
        System.out.print("¿Cuántos " + articulo2 + " desea?:");
        cant2= sc.nextInt();
        System.out.print("¿Cuántas " + articulo3 + " desea?:");
        cant3= sc.nextInt();
        System.out.print("¿Cuántas " + articulo4 + " desea?:");
        cant4= sc.nextInt();
        System.out.print("¿Cuántas " + articulo5 + " desea?:");
        cant5= sc.nextInt();
        sc.nextLine();
        //=====================================================================
        //PREGUNTAR EL NOMBRE AL CLIENTE PARA LA FACTURA
        System.out.print("¿A quién va esta factura?:");
        nombrecomleto=sc.nextLine();
        //====================================================================
        //CALCULAR TODO LO NECESARIO DE LA FORMA QUE ESTIMEIS OPORTUNA
        totalsinIVA= (cant1 * precio1) + (cant2 * precio2) + (cant3 * precio3)
                    + (cant4 * precio4) + (cant5 * precio5);
        totalconIVA = totalsinIVA + (totalsinIVA * IVA);
        cantidadIVA= totalsinIVA * IVA;
        descuentoaleatorio= random.nextInt(6)+5;
        descuento1ªvez = totalconIVA * descuentoaleatorio / 100;
        totalfinal = totalconIVA - descuento1ªvez;
        String nombreMayus = nombrecomleto.toUpperCase();
        int espacio = nombrecomleto.indexOf(" ");
        String primerNombre = (espacio != -1) ? nombrecomleto.substring(0, espacio) : nombrecomleto;
        //====================================================================
        //SR/SRA AQUI TIENE SU FACTURA
        //MOSTRAR EL RESUMEN DE LA FACTURA
        //NOMBRE DEL CLIENTE
        //CUANTO COMPRÓ DE CADA PRODUCTO
        //TOTAL SIN IVA
        //%IVA APLICADO
        //EL IVA QUE SE APLICA AL TOTAL EN BASE AL PORCENTAJE ANTERIOR
        //TOTAL CON IVA
        //DESCUENTO ALEATORIO
        //DESCUENTO APLICADO
        //PRECIO FINAL

        System.out.println("\n======================================");
        System.out.println("              FACTURA");
        System.out.println("======================================");
        System.out.println("Cliente: " + nombreMayus);
        System.out.println("Estimado/a Sr/Sra " + primerNombre + ", este es el resumen de su compra:");
        System.out.println("--------------------------------------");
        System.out.printf("%-15s %5s %10s%n", "Artículo", "Cant.", "Subtotal (€)");
        System.out.printf("%-15s %5d %10.2f%n", articulo1, cant1, cant1 * precio1);
        System.out.printf("%-15s %5d %10.2f%n", articulo2, cant2, cant2 * precio2);
        System.out.printf("%-15s %5d %10.2f%n", articulo3, cant3, cant3 * precio3);
        System.out.printf("%-15s %5d %10.2f%n", articulo4, cant4, cant4 * precio4);
        System.out.printf("%-15s %5d %10.2f%n", articulo5, cant5, cant5 * precio5);
        System.out.println("--------------------------------------");
        System.out.printf("Total sin IVA: %25.2f €%n", totalsinIVA);
        System.out.printf("IVA (21%%): %28.2f €%n", cantidadIVA);
        System.out.printf("Total con IVA: %25.2f €%n", totalconIVA);
        System.out.printf("Descuento (%d%%): %22.2f €%n", descuentoaleatorio, descuento1ªvez);
        System.out.printf("PRECIO FINAL: %26.2f €%n", totalfinal);
        System.out.println("======================================");
        sc.nextLine();
        //====================================================================
        //IMPRIMIR MENSAJE DE DESPEDIDA

        System.out.println("\nGracias por su compra, " + primerNombre + "!");
        System.out.println("Esperamos volver a verle pronto 😊");

    }
}

