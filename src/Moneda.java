public class Moneda {
    private String base_code;
    private String target_code;
    private double conversion_rate;
    private double conversion_result;

    public Moneda(Monedas monedas) {
        this.base_code = monedas.base_code();
        this.target_code = monedas.target_code();
        this.conversion_rate = monedas.conversion_rate();
        this.conversion_result = monedas.conversion_result();
    }

    public String getBase_code() {
        return base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public double getConversion_rate() {
        return conversion_rate;
    }

    public double getConversion_result() {
        return conversion_result;
    }

    @Override
    public String toString() {
        return String.format("Conversión: %s %.2f => %s %.2f (Tasa: %.4f)",
                base_code, conversion_result / conversion_rate,
                target_code, conversion_result,
                conversion_rate);
    }
}
