import java.io.*;
public class Leer {
    public static void copiar(String origen, String destino) {

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader(origen));
            bw = new BufferedWriter(new FileWriter(destino));

            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }

            System.out.println("Archivo copiado correctamente.");

        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {

            try {
                if (br != null) br.close();
                if (bw != null) bw.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar archivos");
            }
        }
    }
}