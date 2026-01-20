import java.io.BufferedReader;
import java.io.FileReader;

public class LeerTXT {
    public static String leer (String path, String palabra) {
        StringBuilder lineaFiltrada = new StringBuilder();
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String linea;

            while ((linea = br.readLine()) != null) {
                String lineaMinuscula = linea.toLowerCase();
                String palabraMinuscula = palabra.toLowerCase();
                System.out.println(linea);
                if (lineaMinuscula.contains(palabraMinuscula)) {
                    lineaFiltrada.append(linea).append("\n");
                }
            }
            System.out.println(linea);
            br.close();
        } catch (Exception e) {
            System.out.println("El archivo no existe");
            throw new RuntimeException(e);

        }


        return lineaFiltrada.toString();
    }
}
