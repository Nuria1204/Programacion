import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura {
    public static void escritura(String path, String datos) {
        BufferedWriter bw = null;
        try {
            FileWriter fw = new FileWriter(path, false);
            bw = new BufferedWriter(fw);
            bw.write(datos);
            bw.newLine();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("Eror al cerrar fichero escritura");
                }


            }
        }
    }
}