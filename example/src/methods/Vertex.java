package methods;

import module go.lang;
import go.lang.float64;
import go.lang.Struct;

public final class Vertex implements Struct {
    public float64 X;
    public float64 Y;

    public Vertex() {
        this.X = new float64();
        this.Y = new float64();
    }

    public static float64 Abs(Vertex v) {
        v = v.copy();
        return math.$.Sqrt(
            float64.plus(
                float64.mul(v.X, v.X),
                float64.mul(v.Y, v.Y)
            )
        );
    }

    @Override
    public Vertex copy() {
        Vertex G_1 = new Vertex();
        G_1.X = this.X;
        G_1.Y = this.Y;
        return G_1;
    }
}