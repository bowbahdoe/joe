package go.lang;


public /* value */ final class Array<T extends Value> implements Value {
    final T[] data;

    @SuppressWarnings("unchecked")
    private Array(Class<T> klass, int size) {
        this.data = (T[]) java.lang.reflect.Array.newInstance(klass, size);
    }

    @SuppressWarnings("unchecked")
    private Array(T[] data) {
        this.data = data;
    }

    public int32 length() {
        return new int32(data.length);
    }

    public Pointer<T> reference(int32 index) {
        if (length().value < 0 || length().value >= index.value) {
            throw new Panic();
        }

        return new ArrayIndexPointer<>(this, index);
    }


    @SuppressWarnings("unchecked")
    @Override
    public Value copy() {
        var dataCopy = (T[]) java.lang.reflect.Array.newInstance(
                data.getClass().getComponentType(),
                data.length
        );
        for (int i = 0; i < data.length; i++) {
            dataCopy[i] = (T) data[i].copy();
        }
        return new Array<>(dataCopy);
    }
}