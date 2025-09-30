package go.lang;

/// A pointer to a component of something that is itself
/// behind a pointer
public /* value */ final class ZoomedPointer<A, B> implements Pointer<B> {
    private final Lens<A, B> lens;
    private final Pointer<A> pointer;

    public ZoomedPointer(Lens<A, B> lens, Pointer<A> pointer) {
        this.lens = lens;
        this.pointer = pointer;
    }

    @Override
    public Pointer<B> copy() {
        return this;
    }

    @Override
    public B get() {
        return lens.get(pointer.get());
    }

    @Override
    public void set(B value) {
        pointer.set(lens.set(pointer.get(), value));
    }
}
