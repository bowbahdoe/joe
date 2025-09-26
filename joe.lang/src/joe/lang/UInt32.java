package joe.lang;

public /* value */ final class UInt32
    implements ValueType {
    private final int value;

    private UInt32(int value) {
        this.value = value;
    }

    public static UInt32 fromJava(int value) {
        return new UInt32(value);
    }

    public java.lang.String toString() {
        return Integer.toUnsignedString(value);
    }
}