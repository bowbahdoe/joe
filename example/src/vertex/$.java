package vertex;

import module go.lang;
import go.lang.int32;

public final class $ {
    private $() {}

    static void main() {
        // No references taken,
        // no need for LocalVariable
        Vertex G_1 = new Vertex();
        G_1.X = new int32(1);
        G_1.Y = new int32(2);
	    fmt.$.Println(G_1);
    }
}