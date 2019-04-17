package com.company;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;

class MyVisitor extends MyGrammarBaseVisitor<Value>
{

    Map<String,Integer> int
    @Override public Value visitTerminal(TerminalNode node)
    {
        System.err.println("[" + node.getText() + "]");
        return (new Value (node.getText()));
    }
    @Override public Value visitNewVariable(MyGrammarParser.NewVariableContext ctx)
    {
        return visitChildren(ctx);
    }
}