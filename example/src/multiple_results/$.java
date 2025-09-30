package multiple_results;

import go.lang.string;

public final class $ {
    private $() {}

    /* value */ record swap(
        string _0,
        string _1
    ) {}

    static swap swap(
        string x,
        string y
    ) {
        return new multiple_results.$.swap(y, x);
    }

    static void main() {
        multiple_results.$.swap G_1 = multiple_results.$.swap(
            new string("hello"),
            new string("world")
        );
        string a = G_1._0();
        string b = G_1._1();
        fmt.$.Println(a, b);
    }
}