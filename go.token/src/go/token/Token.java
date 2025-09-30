package go.token;

public enum Token {
    // Special tokens
    ILLEGAL(Classification.SPECIAL, "ILLEGAL"),
    EOF(Classification.SPECIAL, "EOF"),
    COMMENT(Classification.SPECIAL, "COMMENT"),

    // Identifiers and basic type literals
    // (these tokens stand for classes of literals)
    IDENT(Classification.LITERAL, "IDENT"),  // main
    INT(Classification.LITERAL, "INT"),    // 12345
    FLOAT(Classification.LITERAL, "FLOAT"),  // 123.45
    IMAG(Classification.LITERAL, "IMAG"),   // 123.45i
    CHAR(Classification.LITERAL, "CHAR"),   // 'a'
    STRING(Classification.LITERAL, "STRING"), // "abc"

    // Operators and delimiters
    ADD(Classification.OPERATOR, "+"), // +
    SUB(Classification.OPERATOR, "-"), // -
    MUL(Classification.OPERATOR, "*"), // *
    QUO(Classification.OPERATOR, "/"), // /
    REM(Classification.OPERATOR, "%"), // %

    AND(Classification.OPERATOR, "&"),     // &
    OR(Classification.OPERATOR, "|"),      // |
    XOR(Classification.OPERATOR, "^"),     // ^
    SHL(Classification.OPERATOR, "<<"),     // <<
    SHR(Classification.OPERATOR, ">>"),     // >>
    AND_NOT(Classification.OPERATOR, "&^"), // &^

    ADD_ASSIGN(Classification.OPERATOR, "+="), // +=
    SUB_ASSIGN(Classification.OPERATOR, "-="), // -=
    MUL_ASSIGN(Classification.OPERATOR, "*="), // *=
    QUO_ASSIGN(Classification.OPERATOR, "/="), // /=
    REM_ASSIGN(Classification.OPERATOR, "%="), // %=

    AND_ASSIGN(Classification.OPERATOR, "&="),     // &=
    OR_ASSIGN(Classification.OPERATOR, "|="),      // |=
    XOR_ASSIGN(Classification.OPERATOR, "^="),     // ^=
    SHL_ASSIGN(Classification.OPERATOR, "<<="),     // <<=
    SHR_ASSIGN(Classification.OPERATOR, ">>="),     // >>=
    AND_NOT_ASSIGN(Classification.OPERATOR, "&^="), // &^=

    LAND(Classification.OPERATOR, "&&"),  // &&
    LOR(Classification.OPERATOR, "||"),   // ||
    ARROW(Classification.OPERATOR, "<-"), // <-
    INC(Classification.OPERATOR, "++"),   // ++
    DEC(Classification.OPERATOR, "--"),   // --

    EQL(Classification.OPERATOR, "=="),    // ==
    LSS(Classification.OPERATOR, "<"),    // <
    GTR(Classification.OPERATOR, ">"),    // >
    ASSIGN(Classification.OPERATOR, "="), // =
    NOT(Classification.OPERATOR, "!"),    // !

    NEQ(Classification.OPERATOR, "!="),      // !=
    LEQ(Classification.OPERATOR, "<="),      // <=
    GEQ(Classification.OPERATOR, ">="),      // >=
    DEFINE(Classification.OPERATOR, ":="),   // :=
    ELLIPSIS(Classification.OPERATOR, "..."), // ...

    LPAREN(Classification.OPERATOR, "("), // (
    LBRACK(Classification.OPERATOR, "["), // [
    LBRACE(Classification.OPERATOR, "{"), // {
    COMMA(Classification.OPERATOR, ","),  // ,
    PERIOD(Classification.OPERATOR, "."), // .

    RPAREN(Classification.OPERATOR, ")"),    // )
    RBRACK(Classification.OPERATOR, "]"),    // ]
    RBRACE(Classification.OPERATOR, "}"),    // }
    SEMICOLON(Classification.OPERATOR, ";"), // ;
    COLON(Classification.OPERATOR, ":"),     // :

    // Keywords
    BREAK(Classification.KEYWORD, "break"),
    CASE(Classification.KEYWORD, "case"),
    CHAN(Classification.KEYWORD, "chan"),
    CONST(Classification.KEYWORD, "const"),
    CONTINUE(Classification.KEYWORD, "continue"),

    DEFAULT(Classification.KEYWORD, "default"),
    DEFER(Classification.KEYWORD, "defer"),
    ELSE(Classification.KEYWORD, "else"),
    FALLTHROUGH(Classification.KEYWORD, "fallthrough"),
    FOR(Classification.KEYWORD, "for"),

    FUNC(Classification.KEYWORD, "func"),
    GO(Classification.KEYWORD, "go"),
    GOTO(Classification.KEYWORD, "goto"),
    IF(Classification.KEYWORD, "if"),
    IMPORT(Classification.KEYWORD, "import"),

    INTERFACE(Classification.KEYWORD, "interface"),
    MAP(Classification.KEYWORD, "map"),
    PACKAGE(Classification.KEYWORD, "package"),
    RANGE(Classification.KEYWORD, "range"),
    RETURN(Classification.KEYWORD, "return"),

    SELECT(Classification.KEYWORD, "select"),
    STRUCT(Classification.KEYWORD, "struct"),
    SWITCH(Classification.KEYWORD, "switch"),
    TYPE(Classification.KEYWORD, "type"),
    VAR(Classification.KEYWORD, "var"),

    TILDE(Classification.ADDITIONAL, "~");

    final Classification classification;
    final String string;

    Token(Classification classification, String string) {
        this.classification = classification;
        this.string = string;
    }

    private enum Classification {
        SPECIAL,
        LITERAL,
        OPERATOR,
        KEYWORD,

        // additional tokens, handled in an ad-hoc manner
        ADDITIONAL
    }

    @Override
    public String toString() {
        return string;
    }
}
