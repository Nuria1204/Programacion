import java.util.Scanner;
public class Ejecutar {
    static void main() {
        String origen = "C:\\Users\\1DAW\\IdeaProjects\\Ejercicio 4 CSV\\src\\datos 2.csv";
        String destino = "C:\\Users\\1DAW\\IdeaProjects\\Ejercicio 9 CSV\\src\\ordenado.csv";
        Leer.OrdenarPorPrimerCampo(origen, destino);
        System.out.println("Archivo ordenado.csv creado correctamente");
    }
}