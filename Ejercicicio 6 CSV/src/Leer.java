import java.io.*;

public class Leer {

    public static void leerCSV(String ruta) {
        BufferedReader br = null;

        try {
            FileReader fr = new FileReader(ruta);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                System.out.println("Apellido: " + datos[2]);
                System.out.println("C.Postal: " + datos[0]);
                System.out.println("Móvil: " + datos[1]);
                System.out.println("---------------------");
            }

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