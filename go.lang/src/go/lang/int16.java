package go.lang;

public /* value */ final class int16
    implements Value {
    final short value;

    public int16(short value) {
        this.value = value;
    }

    public int16() {
        this((short) 0);
    }

    public java.lang.String toString() {
        return Integer.toString(value);
    }

    @Override
    public Value copy() {
        return this;
    }
}