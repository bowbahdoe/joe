package struct_fields;

import module joe.lang;

public final class $pkg {
    private $pkg() {}

    static void main() {
        Vertex v = new Vertex();
        v.X = new Int32(1);
        v.Y = new Int32(2);

        v.X = new Int32(4);

	    fmt.$pkg.Println(v.X);
    }
}