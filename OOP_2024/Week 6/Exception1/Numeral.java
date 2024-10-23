

public class Numeral extends Expression {
    private double value;

    public Numeral() {
        value = 0.0;
    }

    public Numeral(double value) {
        this.value = value;
    }

    public String toString() {
        int x = (int) value;
        return String.valueOf(x);
    }

    public double evaluate() {
        return value;
    }
}