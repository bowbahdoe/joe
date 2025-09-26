package multiple_results;

public final class $pkg {
    private $pkg() {}

    /* value */ record swap(
        joe.lang.String _0,
        joe.lang.String _1
    ) {}

    static swap swap(
        joe.lang.String x,
        joe.lang.String y
    ) {
        return new multiple_results.$pkg.swap(y, x);
    }

    static void main() {
        multiple_results.$pkg.swap G_1 = multiple_results.$pkg.swap(
            new joe.lang.String("hello"), 
            new joe.lang.String("world")
        );
        joe.lang.String a = G_1._0();
        joe.lang.String b = G_1._1();
        fmt.$pkg.Println(a, b);
    }
}