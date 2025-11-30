public class Tienda {

    private String producto;
    private double precio;
    private double iva;
    private double descuento;

    private static int numeroProductos= 0;   //Solo lectura
    private static double descuentoGlobal= 0; // Solo escritura desde fuera

    public Tienda(String producto, double precio, double iva, double descuento){
        this.producto= producto;
        this.precio= precio;
        this.iva= iva;
        this.descuento= descuento;
        numeroProductos++;
    }

    public Tienda(String producto) {
        this(producto, 10,21,0);
    }

    public String getProducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public double getDescuento() {
        return descuento;
    }

    public static int getNumeroProductos() {
        return numeroProductos;
    }

    public static void setDescuentoGlobal(double descuento) {
        descuentoGlobal = descuento;
    }

    public double calcularPrecio() {
        double descuentoAplicado = Math.max(descuento, descuentoGlobal);
        double precioConDescuento = precio - (precio * descuentoAplicado / 100);
        double precioFinal =precioConDescuento + (precioConDescuento * iva / 100);
        return precioFinal;
    }

    @Override
    public String toString() {  //Se usa para formar una cadena como esta
        return "Producto: " + producto + "Precio final: " + String.format("%.2f", calcularPrecio()) + "€";
    } //El format es para redondear los números (me lo ha dicho ChatGPT :)
}

