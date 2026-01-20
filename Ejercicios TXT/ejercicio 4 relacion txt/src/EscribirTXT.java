import java.io.BufferedWriter;
import java.io.FileWriter;

public class EscribirTXT {
    public static void escribir(String path, String contenido, boolean append) {
        try {
            FileWriter fw = new FileWriter(path, append);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
