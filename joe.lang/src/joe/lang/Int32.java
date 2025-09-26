package joe.lang;

public /* value */ final class Int32
    implements ValueType {
    private final int value;

    public Int32(int value) {
        this.value = value;
    }

    public static Int32 fromJava(int value) {
        return new Int32(value);
    }

    public Int32() {
        this(0);
    }

    public static Int32 div(Int32 a, Int32 b) {
        return Int32.fromJava(a.value / b.value);
    }

    public java.lang.String toString() {
        return Integer.toString(value);
    }
}