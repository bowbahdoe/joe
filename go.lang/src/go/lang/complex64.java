package go.lang;

public final class complex64 implements Value {
    private final float32 real;
    private final float32 imaginary;

    public complex64() {
        this.real = new float32();
        this.imaginary = new float32();
    }

    public complex64(float32 real, float32 imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public complex64 copy() {
        return this;
    }
}
