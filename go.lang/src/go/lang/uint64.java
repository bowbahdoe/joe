package go.lang;

public /* value */ final class uint64
    implements Value {
    private final long value;

    private uint64(long value) {
        this.value = value;
    }

    public java.lang.String toString() {
        return Long.toUnsignedString(value);
    }

    @Override
    public uint64 copy() {
        return this;
    }
}