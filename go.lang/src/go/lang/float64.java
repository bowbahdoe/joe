package go.lang;

public /* value */ final class float64
    implements Value {
    private final double value;

    public float64(double value) {
        this.value = value;
    }

    public float64() {
        this.value = 0;
    }

    public static float64 mul(float64 a, float64 b) {
        return new float64(a.value * b.value);
    }

    public static float64 plus(float64 a, float64 b) {
        return new float64(a.value + b.value);
    }

    public java.lang.String toString() {
        return Double.toString(value);
    }

    @Override
    public Value copy() {
        return this;
    }
}