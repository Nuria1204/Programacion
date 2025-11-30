class Lavadora extends Electrodomestico {
    private double carga;
    private final static double CARGA_DEF = 5;

    public Lavadora() {
        super();
        this.carga = CARGA_DEF;
    }

    public Lavadora(double precioBase, Color color, String consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() { return carga; }

    @Override
    public double precioFinal() {
        double total = super.precioFinal();

        if (carga > 6) total += 50;

        return total;
    }

    @Override
    public String toString() {
        return super.toString() + " | Carga: " + carga + "kg";
    }
}