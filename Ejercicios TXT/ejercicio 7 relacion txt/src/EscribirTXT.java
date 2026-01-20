import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirTXT {
    public static void escribir(String path, String contenido, boolean append) {
        try {
            FileWriter fw = new FileWriter(path, false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
