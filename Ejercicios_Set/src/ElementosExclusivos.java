import java.util.HashSet;
public class ElementosExclusivos {
    static void main() {
        HashSet<String> cuidades1 = new HashSet<>();
        cuidades1.add("Madrid");
        cuidades1.add("Barcelona");
        cuidades1.add("Valencia");

        HashSet<String> ciudades2 = new HashSet<>();
        ciudades2.add("Sevilla");
        ciudades2.add("Valencia");
        ciudades2.add("Bilbao");

        HashSet<String> exclusivos1 = new HashSet<>(cuidades1);
        HashSet<String> exclusivos2 = new HashSet<>(ciudades2);

        exclusivos1.removeAll(ciudades2);
        exclusivos2.removeAll(cuidades1);

        System.out.println("Exclusivos de ciudades1: " + exclusivos1);
        System.out.println("Exclusivos de ciudades2: " + exclusivos2);
    }
}


