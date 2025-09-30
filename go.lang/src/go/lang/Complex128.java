package go.lang;

public final class Complex128 implements Value {
    private final float64 real;
    private final float64 imaginary;

    public Complex128() {
        this.real = new float64();
        this.imaginary = new float64();
    }

    public Complex128(float64 real, float64 imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public Complex128 copy() {
        return this;
    }
}
