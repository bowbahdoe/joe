package joe.lang;

public /* value */ final class Float32
    implements ValueType {
    private final float value;

    private Float32(float value) {
        this.value = value;
    }

    public static Float32 fromJava(float value) {
        return new Float32(value);
    }

    public java.lang.String toString() {
        return Float.toString(value);
    }
}