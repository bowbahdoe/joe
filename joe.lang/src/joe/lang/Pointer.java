package joe.lang;

import module java.base;

public final class Pointer<T> implements Type {
    private final Supplier<T> get;
    private final Consumer<T> set;

    public Pointer(Supplier<T> get, Consumer<T> set) {
        this.get = get;
        this.set = set;
    }

    public T get() {
        return get.get();
    }

    public void set(T value) {
        set.accept(value);
    }
}