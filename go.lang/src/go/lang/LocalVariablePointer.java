package go.lang;

/* value */ final class LocalVariablePointer<T> implements Pointer<T> {
    private final LocalVariable<T> localVariable;

    public LocalVariablePointer(LocalVariable<T> localVariable) {
        this.localVariable = localVariable;
    }

    @Override
    public Pointer<T> copy() {
        return this;
    }

    @Override
    public T get() {
        return localVariable.get();
    }

    @Override
    public void set(T value) {
        localVariable.set(value);
    }
}
