public class Main {
    public static void main(String[] args) {

        Tienda impresora = new Tienda("Impresora HP", 100, 21, 5);
        Tienda raton = new Tienda("Ratón Logitech"); // precio = 10€, iva=21, desc=0
        Tienda libro = new Tienda("Libro Java", 20, 4, 15);

        System.out.println("----- DATOS INICIALES -----");
        System.out.println(impresora);
        System.out.println(raton);
        System.out.println(libro);
        System.out.println("Número de productos: " + Tienda.getNumeroProductos());


        Tienda.setDescuentoGlobal(10);
        raton.setPrecio(12);

        System.out.println("\n----- DESPUÉS DEL BLACK FRIDAY -----");
        System.out.println(impresora);
        System.out.println(raton);
        System.out.println(libro);
        System.out.println("Número de productos: " + Tienda.getNumeroProductos());
    }
}