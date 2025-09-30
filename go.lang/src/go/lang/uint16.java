package go.lang;

/// the set of all unsigned 16-bit integers (0 to 65535)
public /* value */ final class uint16
    implements Value {
    private final short value;

    private uint16(short value) {
        this.value = value;
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(Short.toUnsignedInt(value));
    }


    @Override
    public uint16 copy() {
        return this;
    }
}