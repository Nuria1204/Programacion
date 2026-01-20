import java.io.*;
public class Leer {

    public static void contarlineas(String ruta) {
        BufferedReader br = null;
        int contador = 0;

        try {
            FileReader fr = new FileReader(ruta);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                contador++;
            }
            System.out.println("Número total de líneas: " + contador);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("ERROR AL CERRAR EL FICHERO DE LECTURA");
                }
            }
        }
    }
}