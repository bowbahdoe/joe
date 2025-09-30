package go.lang;

public final class Complex64 implements Value {
    private final float32 real;
    private final float32 imaginary;

    public Complex64() {
        this.real = new float32();
        this.imaginary = new float32();
    }

    public Complex64(float32 real, float32 imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public Complex64 copy() {
        return this;
    }
}
