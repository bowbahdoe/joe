package go.lang;

/// Go's interfaces can have private methods,
/// that can't be modeled with interfaces in the JVM.
/// They can, however, be modeled with abstract classes.
///
/// Luckily we need to be doing some nonsense to generate
/// "interface" implementations on the fly for classes anyway,
/// so we don't necessarily need to model interface inheritance
/// directly like how Java interfaces do.
///
/// At least I don't think we do...
///
/// If that holds then an abstract class could work.
public non-sealed abstract class Interface
        implements Value {
}
