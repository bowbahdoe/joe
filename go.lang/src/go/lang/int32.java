package go.lang;

public /* value */ final class int32
    implements Value {
    final int value;

    public int32(int value) {
        this.value = value;
    }


    public int32() {
        this(0);
    }

    public static int32 div(int32 a, int32 b) {
        return new int32(a.value / b.value);
    }

    public java.lang.String toString() {
        return Integer.toString(value);
    }

    @Override
    public Value copy() {
        return this;
    }
}