public class Ejecutar {
    public static void main(String[] args) {

        String origen = "C:\\Users\\1DAW\\IdeaProjects\\Ejercicio 4 CSV\\src\\datos 2.csv";
        String destino = "C:\\Users\\1DAW\\IdeaProjects\\Ejercicio 8 CSV\\src\\adultos.csv";
        Leer.FiltrarAdultos(origen, destino);
        System.out.println("Archivo adultos.csv generado correctamente");

    }
}