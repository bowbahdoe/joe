package pointer_to_structs;

import module joe.lang;

public final class $pkg {
    private $pkg() {}

    static void main() {
        Vertex G_1 = new Vertex();
        G_1.X = new Int32(1);
        G_1.Y = new Int32(2);

        LocalVariable<Vertex> v = new LocalVariable<>(G_1);
        Pointer<Vertex> p = v.reference();

        p.get().X = new Int32(1000000000);

        fmt.$pkg.Println(v.get());
    }
}