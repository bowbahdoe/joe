package main;

import go.lang.int32;
import go.lang.LocalVariable;
import go.lang.Pointer;

public final class $ {
    private $() {}

    static void main() {
        LocalVariable<int32> i = new LocalVariable<>(new int32(42));
        LocalVariable<int32> j = new LocalVariable<>(new int32(2071));

        Pointer<int32> p = i.reference();

        fmt.$.Println(p.get());
        p.set(new int32(21));

        fmt.$.Println(i.get());

        p = j.reference();
        p.set(int32.div(p.get(), new int32(37)));
        fmt.$.Println(j.get());
    }
}