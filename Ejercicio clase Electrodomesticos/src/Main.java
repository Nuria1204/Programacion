public class Main {
    public static void main() {

        Lavadora lavadoraAEG = new Lavadora(
                400, Color.PLATEADO, "PK", 30, 7
        );

        Television tvSamsung = new Television();

        System.out.println("Lavadora AEG -> " + lavadoraAEG);
        System.out.println("Precio final: " + lavadoraAEG.precioFinal() + "€\n");

        System.out.println("TV Samsung (por defecto) -> " + tvSamsung);
        System.out.println("Precio final: " + tvSamsung.precioFinal() + "€\n");

        tvSamsung = new Television(
                190, Color.NEGRO, "A+", 10, 24, true
        );

        System.out.println("TV Samsung (actualizada) -> " + tvSamsung);
        System.out.println("Precio final: " + tvSamsung.precioFinal() + "€");
    }
}