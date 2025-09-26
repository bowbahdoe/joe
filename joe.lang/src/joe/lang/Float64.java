package joe.lang;

public /* value */ final class Float64
    implements ValueType {
    private final double value;

    private Float64(double value) {
        this.value = value;
    }

    public Float64() {
        this.value = 0;
    }

    public static Float64 mul(Float64 a, Float64 b) {
        return new Float64(a.value * b.value);
    }


    public static Float64 plus(Float64 a, Float64 b) {
        return new Float64(a.value + b.value);
    }

    public static Float64 fromJava(double value) {
        return new Float64(value);
    }

    public java.lang.String toString() {
        return Double.toString(value);
    }
}