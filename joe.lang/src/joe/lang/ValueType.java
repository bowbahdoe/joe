package joe.lang;

public sealed interface ValueType 
    extends Type
    permits UInt8, UInt16, UInt32, Int32, Float32, Float64, Array, Struct, Slice, String {

}