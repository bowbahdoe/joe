package go.ast;

import module go.token;

public sealed interface Node permits Declaration, Expression, Statement {
    // position of first character belonging to the node
    Pos pos();
    // position of first character immediately after the node
    Pos end();
}
