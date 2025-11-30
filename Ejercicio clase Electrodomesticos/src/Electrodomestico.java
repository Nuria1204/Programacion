public class Electrodomestico {

    protected double precioBase;
    protected Color color;
    protected String consumoEnergetico; // A+, A, B, C, D, E, F, PK
    protected double peso;

    private final static double PRECIO_DEF = 100;
    private final static Color COLOR_DEF = Color.BLANCO;
    private final static String CONSUMO_DEF = "A";
    private final static double PESO_DEF = 10;


    public Electrodomestico() {
        this.precioBase = PRECIO_DEF;
        this.color = COLOR_DEF;
        this.consumoEnergetico = CONSUMO_DEF;
        this.peso = PESO_DEF;
    }

    public Electrodomestico(double precioBase, Color color, String consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecioBase() { return precioBase; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }

    public Color getColor() { return color; }
    public void setColor(Color color) { this.color = color; }

    public String getConsumoEnergetico() { return consumoEnergetico; }
    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    private String comprobarConsumoEnergetico(String letra) {
        String[] consumosValidos = {"A+", "A", "B", "C", "D", "E", "F", "PK"};

        for (String c : consumosValidos) {
            if (c.equalsIgnoreCase(letra)) return c;
        }
        return CONSUMO_DEF;
    }

    public double precioFinal() {
        double total = precioBase;

        switch (consumoEnergetico) {
            case "A+" -> total += 120;
            case "A"  -> total += 100;
            case "B"  -> total += 80;
            case "C"  -> total += 60;
            case "D"  -> total += 50;
            case "E"  -> total += 30;
            case "F"  -> total += 10;
            case "PK" -> total += 100;
        }

        if (peso >= 0 && peso <= 19) total += 10;
        else if (peso <= 49) total += 30;
        else if (peso <= 79) total += 50;
        else total += 100;

        return total;
    }

    @Override
    public String toString() {
        return "Precio base: " + precioBase +
                "€ | Consumo: " + consumoEnergetico +
                " | Peso: " + peso + "kg";
    }
}

