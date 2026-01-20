public class Ejecutadora {
    public static void main(String[] args) {
        LeerTXT leerDocumento = new LeerTXT();
        String ruta1 = "C:\\Users\\1DAW\\Desktop\\Archivostxt\\archivo1.txt";
        String ruta2 = "C:\\Users\\1DAW\\Desktop\\Archivostxt\\archivo2.txt";
        String rutaMezcla = "C:\\Users\\1DAW\\Desktop\\Archivostxt\\archivo3.txt";
        System.out.println("Leyendo documento 1...");
        String contenido1 = leerDocumento.leer(ruta1);

        System.out.println("Leyendo documento 2...");
        String contenido2 = leerDocumento.leer(ruta2);
        String contenidoMezclado = contenido1 + contenido2;
        System.out.println("Mezclando contenido");

        EscribirTXT.escribir(rutaMezcla, contenidoMezclado, false);


    }
}