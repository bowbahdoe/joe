package go.lang;

public /* value */ final class bool implements Value {
    private final boolean value;

    public bool() {
        this.value = false;
    }

    public bool(boolean value) {
        this.value = value;
    }

    @Override
    public bool copy() {
        return this;
    }
}
