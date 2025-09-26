package joe.lang;


public sealed interface Type
    permits Pointer, ValueType {

    default Type deepCopy() { throw new IllegalStateException(); }
}