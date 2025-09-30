package go.lang;

/* value */ final class NilPointer<T> implements Pointer<T> {
    @Override
    public NilPointer<T> copy() {
        return this;
    }

    @Override
    public T get() {
        throw new Panic();
    }

    @Override
    public void set(T value) {
        throw new Panic();
    }
}
