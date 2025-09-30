package go.token;

public final class Pos {
    private final int value;

    public static final Pos NO_POS = new Pos(0);

    private Pos(int value) {
        this.value = value;
    }
}
