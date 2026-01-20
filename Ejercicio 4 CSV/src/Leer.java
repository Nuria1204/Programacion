import java.io.*;

public class Leer {
    public static void Lectura(String ruta){
        BufferedReader br= null;
        try {
            FileReader fr= new FileReader(ruta);
            br= new BufferedReader(fr);

            String linea;
            while ((linea= br.readLine())!= null){
                System.out.println(linea);
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }finally {
            if (br != null){
                try {
                    br.close();
                }catch (IOException e){
                    System.out.println("ERROR AL CERRAR EL FICHERO DE LECTURA");
                }
            }
        }
    }
}
