package go.lang;

public interface Lens<A, B> {
    B get(A a);
    A set(A a, B b);
}
