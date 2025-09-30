package go.lang;

public /* value */ final class int64
    implements Value {
    final long value;

    public int64(long value) {
        this.value = value;
    }

    public int64() {
        this(0);
    }

    public java.lang.String toString() {
        return Long.toString(value);
    }

    @Override
    public Value copy() {
        return this;
    }
}