package joe.lang;

/// the set of all unsigned 16-bit integers (0 to 65535)
public /* value */ final class UInt16
    implements ValueType {
    private final short value;

    private UInt16(short value) {
        this.value = value;
    }

    public static UInt16 fromJava(short value) {
        return new UInt16(value);
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(Short.toUnsignedInt(value));
    }
}