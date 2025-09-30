package go.lang;

/// A Runtime Value in the Go Language
///
/// All of these are implemented as value classes which, for the most part,
/// means that when we get arrays of them we can get flattening.
///
/// As a consequence, things like {@link Struct}s are not directly mutable at runtime
/// even though they are in the actual underlying language.
///
/// We can fake this in two ways
///
/// 1. By translating direct assignments to use a .with method and a mutable local
/// 2. By translating `*Thing` parameters in methods to `Pointer<Thing>`.
///
/// We really can't fake the mutability of an {@link Array} effectively, so
/// instead for that particular case we do need to actually abide by "pass by value"
/// semantics and copy all arrays (and structures which might directly contain arrays)
/// when they are passed.
///
/// There are basically three places where we might want to take a pointer.
///
/// 1. To a local variable
/// 2. To a struct member
/// 3. To an array element
///
/// Then for pointers within pointers we can make use of our good
/// friends {@link Lens}.
///
/// The interesting caveat is that pointers in Go are directly comparable.
/// As such we need to make sure that two independently constructed
/// pointers to the same "place" are comparable. Such are the troubles
/// of reconstructing identity from scratch.
///
/// How do we do this? Well one part is that in generated code we can make {@link Lens}
/// implementations for accessing struct members singletons. We can further make
/// implementations for drilling into array indexes value types in their own right.
///
public sealed interface Value
        permits Array, complex128, complex64, float32, float64, Function, int16, int32, int64, int8, Interface, Pointer, Slice, string, Struct, bool, uint16, uint32, uint64, uint8 {

    /// Returns a deep copy of this value.
    ///
    /// This is intended to be used when a value is "passed-by-value"
    /// to a function. For most values this will be a no-op, as they
    /// will be implemented via value types.
    ///
    /// The exception is {@link Array} as well as any {@link Struct} containing an {@link Array}
    /// either directly or transitively. The JVM does not have value arrays so those must actually
    /// be copied.
    ///
    /// Additionally, each implementing class must return an instance of the same class when
    /// this method is called. That is, the following code should always remain safe.
    ///
    /// ```java
    /// <T extends Value> T copy(T value) {
    ///     return (T) value.deepCopy();
    /// }
    /// ```
    Value copy();
}