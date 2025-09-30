package go.lang;

/// the set of all unsigned  8-bit integers (0 to 255)
public /* value */ final class uint8
    implements Value {
    private final byte value;

    private uint8(byte value) {
        this.value = value;
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(Byte.toUnsignedInt(value));
    }

    @Override
    public uint8 copy() {
        return this;
    }
}