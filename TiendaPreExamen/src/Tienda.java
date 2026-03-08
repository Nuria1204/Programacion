import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tienda {
    static void main() {
        Map<String, Producto> productos = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        //Productos tienda
        productos.put("p1", new Producto("p1", "portatil",900, 10,true));
        productos.put("p2", new Producto("p2", "ratón", 20, 50, true));
        productos.put("p3", new Producto("p3","teclado", 40, 30, true));
        productos.put("p4", new Producto("p4", "monitor", 300, 15,true));
        productos.put("p5", new Producto("p5", "USB", 10, 100, true));

        int opcion;

        do {

            System.out.println("\nMENU");
            System.out.println("1 Alta producto");
            System.out.println("2 Modificar stock");
            System.out.println("3 Ver productos disponibles");
            System.out.println("4 Ver productos sin stock");
            System.out.println("5 Borrar producto");
            System.out.println("6 Salir");

            opcion =sc.nextInt();
            sc.nextLine();

            //Alta socio
            if (opcion ==1){
                System.out.println("Codigo:");
                String codido = sc.nextLine();
                if (productos.containsKey(codido)){
                    System.out.println("Codigo ya existe");
                }else{
                    System.out.println("Nombre:");
                    String nombre = sc.nextLine();
                    
                    System.out.println("Precio:");
                    double precio = sc.nextDouble();
                        
                    System.out.println("Stock:");
                    int stock = sc.nextInt();
                    sc.nextLine();
                    
                    productos.put(codido, new Producto(codido,nombre,precio,stock,true));
                    System.out.println("Producto añadido");
                }
            }
            
            //Modificar stock
            if (opcion == 2) {
                System.out.println("Codigo del producto:");
                String codigo = sc.nextLine();

                if (productos.containsKey(codigo)) ;
                System.out.println("Nuevo stock:");
                int stock = sc.nextInt();
                sc.nextLine();

                productos.get(codigo).setStock(stock);
                System.out.println("Stock actualizado");
            }else {
                System.out.println("Producto no encontrado");
            }

            //Productos disponibles
            if (opcion == 3){
                for (Producto p: productos.values()){
                    if (p.isDisponible()){
                        System.out.println(p);
                    }
                }
            }
            //Productos sin stock
            if (opcion == 4){
                for (Producto p : productos.values()){
                    if (p.getStock() == 0){
                        System.out.println(p);
                    }
                }
            }
            //Borrar producto
            if (opcion == 5){
               System.out.println("Codigo:");
               String codigo = sc.nextLine();

               if (productos.containsKey(codigo)){
                   productos.remove(codigo);
                   System.out.println("Producto eliminado");
               }else {
                   System.out.println("Producto no encontrado");
               }
            }
            
        }while (opcion != 6);
            System.out.println("Cerrando programa....");


    }
}
