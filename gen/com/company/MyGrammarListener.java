// Generated from C:/Users/Martin/Documents/S3/Automata/calculatorTreeVisitor/src/main/java/com/company\MyGrammar.g4 by ANTLR 4.7.2
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#myStart}.
	 * @param ctx the parse tree
	 */
	void enterMyStart(MyGrammarParser.MyStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#myStart}.
	 * @param ctx the parse tree
	 */
	void exitMyStart(MyGrammarParser.MyStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(MyGrammarParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(MyGrammarParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(MyGrammarParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(MyGrammarParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(MyGrammarParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(MyGrammarParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code onInteger}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOnInteger(MyGrammarParser.OnIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code onInteger}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOnInteger(MyGrammarParser.OnIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additionExpression}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpression(MyGrammarParser.AdditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additionExpression}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpression(MyGrammarParser.AdditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code onVariable}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOnVariable(MyGrammarParser.OnVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code onVariable}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOnVariable(MyGrammarParser.OnVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractionExpression}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtractionExpression(MyGrammarParser.SubtractionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractionExpression}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtractionExpression(MyGrammarParser.SubtractionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code onBoolean}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOnBoolean(MyGrammarParser.OnBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code onBoolean}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOnBoolean(MyGrammarParser.OnBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpression}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpression(MyGrammarParser.MultiplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpression}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpression(MyGrammarParser.MultiplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divisionExpression}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivisionExpression(MyGrammarParser.DivisionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divisionExpression}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivisionExpression(MyGrammarParser.DivisionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalsBoolean}
	 * labeled alternative in {@link MyGrammarParser#myBoolean}.
	 * @param ctx the parse tree
	 */
	void enterEqualsBoolean(MyGrammarParser.EqualsBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalsBoolean}
	 * labeled alternative in {@link MyGrammarParser#myBoolean}.
	 * @param ctx the parse tree
	 */
	void exitEqualsBoolean(MyGrammarParser.EqualsBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lesserThanBoolean}
	 * labeled alternative in {@link MyGrammarParser#myBoolean}.
	 * @param ctx the parse tree
	 */
	void enterLesserThanBoolean(MyGrammarParser.LesserThanBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lesserThanBoolean}
	 * labeled alternative in {@link MyGrammarParser#myBoolean}.
	 * @param ctx the parse tree
	 */
	void exitLesserThanBoolean(MyGrammarParser.LesserThanBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanBoolean}
	 * labeled alternative in {@link MyGrammarParser#myBoolean}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanBoolean(MyGrammarParser.GreaterThanBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanBoolean}
	 * labeled alternative in {@link MyGrammarParser#myBoolean}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanBoolean(MyGrammarParser.GreaterThanBooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MyGrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MyGrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MyGrammarParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MyGrammarParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MyGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MyGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MyGrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MyGrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MyGrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MyGrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#newVariable}.
	 * @param ctx the parse tree
	 */
	void enterNewVariable(MyGrammarParser.NewVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#newVariable}.
	 * @param ctx the parse tree
	 */
	void exitNewVariable(MyGrammarParser.NewVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(MyGrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(MyGrammarParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(MyGrammarParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(MyGrammarParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MyGrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MyGrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MyGrammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MyGrammarParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(MyGrammarParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(MyGrammarParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(MyGrammarParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(MyGrammarParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#division}.
	 * @param ctx the parse tree
	 */
	void enterDivision(MyGrammarParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#division}.
	 * @param ctx the parse tree
	 */
	void exitDivision(MyGrammarParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(MyGrammarParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(MyGrammarParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#subtraction}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(MyGrammarParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#subtraction}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(MyGrammarParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#equals}.
	 * @param ctx the parse tree
	 */
	void enterEquals(MyGrammarParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#equals}.
	 * @param ctx the parse tree
	 */
	void exitEquals(MyGrammarParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#whitespace}.
	 * @param ctx the parse tree
	 */
	void enterWhitespace(MyGrammarParser.WhitespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#whitespace}.
	 * @param ctx the parse tree
	 */
	void exitWhitespace(MyGrammarParser.WhitespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#eol}.
	 * @param ctx the parse tree
	 */
	void enterEol(MyGrammarParser.EolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#eol}.
	 * @param ctx the parse tree
	 */
	void exitEol(MyGrammarParser.EolContext ctx);
}