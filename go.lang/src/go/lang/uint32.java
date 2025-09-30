package go.lang;

public /* value */ final class uint32
    implements Value {
    private final int value;

    private uint32(int value) {
        this.value = value;
    }

    public static uint32 fromJava(int value) {
        return new uint32(value);
    }

    public java.lang.String toString() {
        return Integer.toUnsignedString(value);
    }

    @Override
    public uint32 copy() {
        return this;
    }
}