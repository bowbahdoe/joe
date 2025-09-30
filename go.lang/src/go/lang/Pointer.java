package go.lang;

public sealed interface Pointer<T>
        extends Value
        permits ArrayIndexPointer, LocalVariablePointer, NilPointer, ZoomedPointer {
    T get();

    void set(T value);

    default <R> Pointer<R> zoom(Lens<T, R> lens) {
        return new ZoomedPointer<>(lens, this);
    }
}