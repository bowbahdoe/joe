package pointers_to_structs;

import module go.lang;

public final class $ {
    private $() {}

    static void main() {

        // [5]Vertex
        // [ x, y, x, y, x, y ]

        // [ ptr, ptr, ptr, ...]
        //   |
        //   v
        // [x, y]
        int[] xs;
        int[] ys;

        Vertex G_1 = new Vertex();
        G_1 = G_1.with(G_2 -> {
            G_2.X = new int32(1);
            G_2.Y = new int32(2);
        });

        LocalVariable<Vertex> v = new LocalVariable<>(G_1);
        Pointer<Vertex> p = v.reference();

        Pointer<int32> X = p.zoom(Vertex.$X.LENS);

        X.set(new int32(1000000000));

        fmt.$.Println(v.get());
    }
}