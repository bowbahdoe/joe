package methods;

import module go.lang;
import go.lang.float64;

public final class $ {
    private $() {}

    static void main() {
        Vertex v = new Vertex();
        v.X = new float64(3.0);
        v.Y = new float64(4.0);
	    fmt.$.Println(
            Vertex.Abs(v)
        );
    }
}