import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class LeerTXT {
    public static void leer( String path, String palabra) {
        int contador = 0;
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                String lineaMinuscula = linea.toLowerCase();
                String palabraMinuscula = palabra.toLowerCase();
                int vecesPalabra = 0;
                while ((vecesPalabra = lineaMinuscula.indexOf(palabraMinuscula, vecesPalabra)) != -1) {
                    contador++;
                    vecesPalabra += palabraMinuscula.length();
                }
            }
            br.close();
            fr.close();
            System.out.println("La palabra " + palabra + " aparece " +  contador + " veces");
        }catch (IOException e) {
            throw  new RuntimeException(e);
        }
    }
}
