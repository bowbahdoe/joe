package go.parser;

import module go.token;

import java.util.EnumSet;
import java.util.Set;

public class Parser {
    static final EnumSet<Token> stmtStart = EnumSet.of(
            Token.BREAK,
            Token.CONST,
            Token.CONTINUE,
            Token.DEFER,
            Token.FALLTHROUGH,
            Token.FOR,
            Token.GO,
            Token.GOTO,
            Token.IF,
            Token.RETURN,
            Token.SELECT,
            Token.SWITCH,
            Token.TYPE,
            Token.VAR
    );

    static final EnumSet<Token> declStart = EnumSet.of(
            Token.IMPORT,
            Token.CONST,
            Token.TYPE,
            Token.VAR
    );

    static final EnumSet<Token> exprEnd = EnumSet.of(
            Token.COMMA,
            Token.COLON,
            Token.SEMICOLON,
            Token.RPAREN,
            Token.RBRACK,
            Token.RBRACE
    );
}
