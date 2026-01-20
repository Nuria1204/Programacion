public class Ejecutadora {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\1DAW\\Desktop\\Archivostxt\\archivo1.txt";
        int lineas = ContarLineas.contar(ruta);
        System.out.println("El archivo tiene  " + lineas + " lineas");
    }
}