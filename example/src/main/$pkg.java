package main;

import module joe.lang;

public final class $pkg {
    private $pkg() {}

    static void main() {
        LocalVariable<Int32> i = new LocalVariable<>(Int32.fromJava(42));
        LocalVariable<Int32> j = new LocalVariable<>(Int32.fromJava(2071));

        Pointer<Int32> p = i.reference();

        fmt.$pkg.Println(p.get());
        p.set(Int32.fromJava(21));

        fmt.$pkg.Println(i.get());

        p = j.reference();
        p.set(Int32.div(p.get(), Int32.fromJava(37)));
        fmt.$pkg.Println(j.get());
    }
}