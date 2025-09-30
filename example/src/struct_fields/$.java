package struct_fields;

import module go.lang;
import go.lang.int32;

public final class $ {
    private $() {}

    static void main() {
        Vertex v = new Vertex();
        v.X = new int32(1);
        v.Y = new int32(2);

        v.X = new int32(4);

	    fmt.$.Println(v.X);
    }
}