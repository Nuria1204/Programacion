import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirTXT {
    public static void escribir (String path, String contenido, boolean append) {
        try {
            FileWriter fw = new FileWriter(path, append);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("Error al escribir");
            throw new RuntimeException(e);
        }
    }
}
