package method_pointers;

import go.lang.float64;
import go.lang.LocalVariable;

public final class $ {
    private $() {}

    static void main() {
        LocalVariable<Vertex> v = new LocalVariable<>(new Vertex());
        v.get().X = new float64(3);
        v.get().Y = new float64(4);
        Vertex.Scale(
                v.reference(),
                new float64(10)
        );
        fmt.$.Println(Vertex.Abs(v.get()));
    }
}
