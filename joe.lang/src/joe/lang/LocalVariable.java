package joe.lang;

/// Mutable box for a value.
///
/// If a reference is ever taken to a local variable
/// we are forced to give it identity via this.
///
/// This type should not appear in any method signatures.
public final class LocalVariable<T> {
    private T value;

    public LocalVariable(T initialValue) {
        this.value = initialValue;
    }

    public T get() {
        return this.value;
    }

    public void set(T value) {
        this.value = value;
    }

    public Pointer<T> reference() {
        return new Pointer<>(this::get, this::set);
    }
}