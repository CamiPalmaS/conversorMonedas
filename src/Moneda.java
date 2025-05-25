public class Moneda {
    private final String base_code;
    private final String target_code;
    private final double conversion_rate;
    private final double conversion_result;

    public Moneda(Monedas monedas) {
        this.base_code = monedas.base_code();
        this.target_code = monedas.target_code();
        this.conversion_rate = monedas.conversion_rate();
        this.conversion_result = monedas.conversion_result();
    }



    @Override
    public String toString() {
        return String.format("Conversión: %s %.2f => %s %.2f (Tasa: %.4f)",
                base_code, conversion_result / conversion_rate,
                target_code, conversion_result,
                conversion_rate);
    }
}
