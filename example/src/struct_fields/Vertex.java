package struct_fields;

import module go.lang;
import go.lang.int32;
import go.lang.Struct;

public final class Vertex implements Struct {
    public int32 X;
    public int32 Y;

    public Vertex() {
        this.X = new int32();
        this.Y = new int32();
    }

    @Override
    public Vertex copy() {
        return this;
    }
}