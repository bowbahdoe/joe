package go.lang;

public non-sealed interface Function
        extends Value {
    @Override
    default Function copy() {
        return this;
    }
}
