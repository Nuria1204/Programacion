import java.util.HashSet;
import java.util.Set;

public class ComprobarElemento {
    static void main() {
        Set<String> ciudades = new HashSet<>();

        ciudades.add("Granada");
        ciudades.add("Madrid");
        ciudades.add("Málaga");
        ciudades.add("Sevilla");
        System.out.println(ciudades);

        String buscar = "Granada";
        if (ciudades.contains(buscar)){
            System.out.println("\n" + buscar + " está en la lista " );
        }else
            System.out.println("\n" +  buscar + " no esta en la lista ");

    }
}
