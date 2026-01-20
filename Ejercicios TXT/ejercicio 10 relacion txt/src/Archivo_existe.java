import java.io.File;

public class Archivo_existe {
    public static boolean existe(String ruta) {
        File archivo = new File(ruta);
        return archivo.exists();
    }
    public static boolean eliminar(String ruta) {
        File archivo = new File(ruta);
        if (archivo.exists()) {
            return archivo.delete();
        }
        return false;
    }
}

