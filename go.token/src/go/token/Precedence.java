package go.token;

public enum Precedence implements Comparable<Precedence> {
    ZERO,
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN;

    static final Precedence LOWEST = ZERO;
    static final Precedence HIGHEST = SEVEN;
    static final Precedence UNARY = SIX;
}
