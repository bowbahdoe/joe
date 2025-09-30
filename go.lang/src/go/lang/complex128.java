package go.lang;

public final class complex128 implements Value {
    private final float64 real;
    private final float64 imaginary;

    public complex128() {
        this.real = new float64();
        this.imaginary = new float64();
    }

    public complex128(float64 real, float64 imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public complex128 copy() {
        return this;
    }
}
