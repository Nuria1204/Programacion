import java.io.BufferedReader;
import java.io.FileReader;

public class LeerTXT {
    public static String leer (String nombreArchivo) {
        StringBuilder contenido = new StringBuilder();
        try {
            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                contenido.append(linea).append("\n");
            }
            br.close();
        } catch (Exception e) {
            System.out.println("El archivo no existe");
            throw new RuntimeException(e);

        }


        return contenido.toString();
    }
}