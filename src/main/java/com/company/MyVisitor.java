package com.company;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;

class MyVisitor extends MyGrammarBaseVisitor<Value>
{
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[35m";
    Map<String,Value> variables = new HashMap<String, Value>();
    @Override public Value visitTerminal(TerminalNode node)
    {
        System.err.println(ANSI_CYAN_BACKGROUND+"[" + node.getText() + "]");
        return (new Value (node.getText()));
    }
    @Override public Value visitNewVariable(MyGrammarParser.NewVariableContext ctx)
    {
        return visitChildren(ctx);
    }
}