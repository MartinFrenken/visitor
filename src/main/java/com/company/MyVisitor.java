package com.company;


import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class MyVisitor extends MyGrammarBaseVisitor<Value>
{
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[35m";
    Map<String,Value> variables = new HashMap<String, Value>();
    @Override public Value visitTerminal(TerminalNode node)
    {
       // System.err.println(ANSI_CYAN_BACKGROUND+"[" + node.getText() + "]");
        return (new Value (node.getText()));
    }
    @Override public Value visitNewVariable(MyGrammarParser.NewVariableContext ctx)
    {
        return visitChildren(ctx);
    }

    @Override public Value visitDeclaration(MyGrammarParser.DeclarationContext ctx)
    {
      String newVariableName =  ctx.newVariable().VARIABLE().getText();
      variables.put(newVariableName,new Value(null));
        return visitChildren(ctx);
    }

    @Override public Value visitIfStatement(MyGrammarParser.IfStatementContext ctx)
    {
       Value value =visit(ctx.myBoolean());

        if(value.asBoolean())
        {
            visit(ctx.input(0));
        }

        else
            System.out.println("this if statement is false");
        return null;
    }
    @Override public Value visitEqualsBoolean(MyGrammarParser.EqualsBooleanContext ctx)
    {
        Value var1 =visit(ctx.expression(0));
        Value var2 =visit(ctx.expression(1));
        if(var1.asInteger()==var2.asInteger())
           return  new Value(true);
        return new Value(false);

    }
    @SuppressWarnings("Duplicates")
    @Override public Value visitLesserThanBoolean(MyGrammarParser.LesserThanBooleanContext ctx)
    {
        Value var1 =visit(ctx.expression(0));
        Value var2 =visit(ctx.expression(1));
        if(var1.asInteger()<var2.asInteger())
            return  new Value(true);
        return new Value(false);

    }
    @SuppressWarnings("Duplicates")
    @Override public Value visitGreaterThanBoolean(MyGrammarParser.GreaterThanBooleanContext ctx)
    {
        Value var1 =visit(ctx.expression(0));
        Value var2 =visit(ctx.expression(1));
        if(var1.asInteger()>var2.asInteger())
            return  new Value(true);
        return new Value(false);

    }

    @Override public Value visitMultiplicationExpression(MyGrammarParser.MultiplicationExpressionContext ctx)
    {


        Value var1 = visit(ctx.expression(0));
        Value var2 = visit(ctx.expression(1));
        int result = var1.asInteger()*var2.asInteger();
        return new Value(result);
    }
    @Override public Value visitDivisionExpression(MyGrammarParser.DivisionExpressionContext ctx)
    {


        Value var1 = visit(ctx.expression(0));
        Value var2 = visit(ctx.expression(1));
        int result = var1.asInteger()/var2.asInteger();
        return new Value(result);
    }
    @Override public Value visitAdditionExpression(MyGrammarParser.AdditionExpressionContext ctx)
    {
        Value var1 = visit(ctx.expression(0));
        Value var2 = visit(ctx.expression(1));
        int result = var1.asInteger()+var2.asInteger();
        return new Value(result);
    }
    @Override public Value visitSubtractionExpression(MyGrammarParser.SubtractionExpressionContext ctx)
    {
        Value var1 = visit(ctx.expression(0));
        Value var2 = visit(ctx.expression(1));
        int result = var1.asInteger()-var2.asInteger();
        return new Value(result);
    }
    @Override public Value visitPowerExpression(MyGrammarParser.PowerExpressionContext ctx)
    {
        Value var1 = visit(ctx.expression(0));
        Value var2 = visit(ctx.expression(1));
        Double result = Math.pow(var1.asInteger(),var2.asInteger());
        return new Value(result);
    }
    @Override public Value visitOnInteger(MyGrammarParser.OnIntegerContext ctx)
    {
        int result = Integer.parseInt(ctx.integer().getText());
        return new Value(result);
    }
    @Override public Value visitPrint(MyGrammarParser.PrintContext ctx)
    {
        Value printValue = visit(ctx.expression(0));
        String printOutput = printValue.asString();
        System.out.println("#"+printOutput);
        return null;
    }
    @Override  public Value visitAssignment(MyGrammarParser.AssignmentContext ctx)
    {
        Value var1 = visit(ctx.expression());
       variables.put(ctx.VARIABLE().getText(),var1);
        return null;
    }
    @Override public Value visitVariable(MyGrammarParser.VariableContext ctx)
    {
      Value returnValue = variables.get(ctx.VARIABLE().getText());
        return returnValue;
    }
    @Override public Value visitWhileStatement(MyGrammarParser.WhileStatementContext ctx)
    {
        Value value =visit(ctx.myBoolean());
     //   System.out.println("start of while loop. Initial value is: "+value);
        while (value.asBoolean())
        {
            for(int i = 0;i<ctx.line().size();i++) {
                visit(ctx.line(i));
                value = visit(ctx.myBoolean());
              //  System.out.println("entered while loop iteration: "+value.asBoolean()+" lines: "+ctx.line().size()+" iteration number: "+i);
            }
        }
       // System.out.println("End of while loop. Boolean value is: "+value.asBoolean() + " bool is: "+ visit(ctx.myBoolean()).asBoolean());
        return null;
    }
}