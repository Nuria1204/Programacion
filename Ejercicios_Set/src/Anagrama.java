import java.util.HashSet;

public class Anagrama {
    static void main() {
        String palabra1 = "roma";
        String palabra2 = "amor";

        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for (char c : palabra1.toCharArray()) {         //tocharArray separa palabras en letras
            set1.add(c);
        }
        for (char c : palabra2.toCharArray()) {
            set2.add(c);
        }
        if (set1.equals(set2)) {
            System.out.println("Son anagramas.");
        } else {
            System.out.println("No son anagramas.");
        }
    }
}


