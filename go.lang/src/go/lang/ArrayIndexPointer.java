package go.lang;

/* value */ final class ArrayIndexPointer<T extends Value> implements Pointer<T> {
    final Array<T> array;
    final int32 index;

    ArrayIndexPointer(Array<T> array, int32 index) {
        this.array = array;
        this.index = index;
    }

    @Override
    public T get() {
        return array.data[index.value];
    }

    @Override
    public void set(T value) {
        array.data[index.value] = value;
    }

    @Override
    public ArrayIndexPointer<T> copy() {
        return this;
    }
}
