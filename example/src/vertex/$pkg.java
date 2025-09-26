package vertex;

import module joe.lang;

public final class $pkg {
    private $pkg() {}

    static void main() {
        // No references taken,
        // no need for LocalVariable
        Vertex G_1 = new Vertex();
        G_1.X = new Int32(1);
        G_1.Y = new Int32(2);
	    fmt.$pkg.Println(G_1);
    }
}