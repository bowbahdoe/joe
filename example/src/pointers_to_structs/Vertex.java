package pointers_to_structs;

import module go.lang;

import java.util.Objects;
import java.util.function.Consumer;

public /* value */ final class Vertex implements Struct {
    public final int32 X;
    public final int32 Y;

    public Vertex() {
        this.X = new int32();
        this.Y = new int32();
    }

    private Vertex(Mutable mutable) {
        this.X = Objects.requireNonNull(mutable.X);
        this.Y = Objects.requireNonNull(mutable.Y);
    }

    @Override
    public Value copy() {
        return this;
    }

    public enum $X implements Lens<Vertex, int32> {
        LENS;


        @Override
        public int32 get(Vertex vertex) {
            return vertex.X;
        }

        @Override
        public Vertex set(Vertex vertex, int32 X) {
            return vertex.with(mutable -> mutable.X = X);
        }
    }

    public enum $Y implements Lens<Vertex, int32> {
        LENS;


        @Override
        public int32 get(Vertex vertex) {
            return vertex.Y;
        }

        @Override
        public Vertex set(Vertex vertex, int32 Y) {
            return vertex.with(mutable -> mutable.Y = Y);
        }
    }

    public Vertex with(Consumer<Mutable> consumer) {
        var mutable = new Mutable(this);
        consumer.accept(mutable);
        return new Vertex(mutable);
    }

    public static final class Mutable {
        public int32 X;
        public int32 Y;

        private Mutable(Vertex vertex) {
            this.X = vertex.X;
            this.Y = vertex.Y;
        }
    }
}