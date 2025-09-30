package go.lang;

public /* value */ final class int8
    implements Value {
    final byte value;

    public int8(byte value) {
        this.value = value;
    }


    public int8() {
        this((byte) 0);
    }

    public java.lang.String toString() {
        return Integer.toString(value);
    }

    @Override
    public Value copy() {
        return this;
    }
}