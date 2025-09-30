package go.lang;

public /* value */ final class float32
    implements Value {
    private final float value;

    public float32(float value) {
        this.value = value;
    }

    public float32() {
        this.value = 0;
    }


    public java.lang.String toString() {
        return Float.toString(value);
    }

    @Override
    public Value copy() {
        return this;
    }
}