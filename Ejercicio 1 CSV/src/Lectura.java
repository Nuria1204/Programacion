import java.io.*;
public class Lectura {
    public static void lectura(String ruta){
        BufferedReader br = null;
        try{
            FileReader fd = new FileReader(ruta);
            br = new BufferedReader(fd);

            String linea;
            while ((linea = br.readLine()) != null ){
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if( br != null) {
                try{
                    br.close();
                } catch (IOException e){
                    System.out.println("Eror al cerrar fichero lectura");
                }
            }
        }
    }
}
