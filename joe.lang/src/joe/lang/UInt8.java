package joe.lang;

/// the set of all unsigned  8-bit integers (0 to 255)
public /* value */ final class UInt8
    implements ValueType {
    private final byte value;

    private UInt8(byte value) {
        this.value = value;
    }

    public static UInt8 fromJava(byte value) {
        return new UInt8(value);
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(Byte.toUnsignedInt(value));
    }
}