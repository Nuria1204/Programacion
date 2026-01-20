import java.io.*;

public class EscribirFicheros {
    public static void escribir(String path,String texto) {
        BufferedWriter bw = null;
        try {
            FileWriter fw = new FileWriter(path);
            bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.newLine();
            bw.close();
            System.out.println("escrito");
        } catch (IOException e) {
            throw  new RuntimeException(e);
        }
    }
}
