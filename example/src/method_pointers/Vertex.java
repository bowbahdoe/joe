package method_pointers;

import module go.lang;

public final class Vertex implements Struct {
    public float64 X;
    public float64 Y;

    public Vertex() {
        this.X = new float64();
        this.Y = new float64();
    }

    //func (v Vertex) Abs() float64 {
    //	return math.Sqrt(v.X*v.X + v.Y*v.Y)
    //}
    public static float64 Abs(Vertex v) {
        // v = v.deepCopy()
        return math.$.Sqrt(
                float64.plus(
                        float64.mul(v.X, v.X),
                        float64.mul(v.Y, v.Y)
                )
        );
    }


    //func (v *Vertex) Scale(f float64) {
    //	v.X = v.X * f
    //	v.Y = v.Y * f
    //}
    public static void Scale(Pointer<Vertex> v, float64 f) {
        v.get().X = float64.mul(v.get().X, f);
        v.get().Y = float64.mul(v.get().Y, f);
    }

    @Override
    public Vertex copy() {
        return this;
    }
}