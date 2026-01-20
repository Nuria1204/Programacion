import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContarLineas {
    public static int contar (String path){
        int contador = 0;
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) !=null) {
                System.out.println(linea);
                contador++;
            }
        } catch (IOException e){
            throw  new RuntimeException(e);
        }
        return contador;
    }
}
