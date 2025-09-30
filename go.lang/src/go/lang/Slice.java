package go.lang;

public final class Slice<T extends Value> implements Value {
    private final Pointer<Array<T>> pointer;
    private final int32 startIndex;
    private final int32 length;
    private final int32 capacity;


    private Slice(
            Pointer<Array<T>> pointer,
            int32 startIndex,
            int32 length,
            int32 capacity
    ) {
        this.pointer = pointer;
        this.startIndex = startIndex;
        this.length = length;
        this.capacity = capacity;
    }

    @Override
    public Slice<T> copy() {
        return this;
    }
}