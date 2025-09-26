package methods;

import module joe.lang;

public final class Vertex$methods {
    private Vertex$methods() {}

    public static Float64 Abs(Vertex v) {
        return math.$pkg.Sqrt(
            Float64.plus(
                Float64.mul(v.X, v.X),
                Float64.mul(v.Y, v.Y)
            )
        );
    }
    
}