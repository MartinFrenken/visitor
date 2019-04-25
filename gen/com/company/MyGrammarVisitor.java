// Generated from C:/Users/win 10/IdeaProjects/visitor/src/main/java/com/company\MyGrammar.g4 by ANTLR 4.7.2
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#myStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyStart(MyGrammarParser.MyStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(MyGrammarParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(MyGrammarParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code onInteger}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnInteger(MyGrammarParser.OnIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additionExpression}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpression(MyGrammarParser.AdditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code onVariable}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnVariable(MyGrammarParser.OnVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtractionExpression}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractionExpression(MyGrammarParser.SubtractionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code onBoolean}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnBoolean(MyGrammarParser.OnBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpression}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpression(MyGrammarParser.MultiplicationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divisionExpression}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionExpression(MyGrammarParser.DivisionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalsBoolean}
	 * labeled alternative in {@link MyGrammarParser#myBoolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsBoolean(MyGrammarParser.EqualsBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lesserThanBoolean}
	 * labeled alternative in {@link MyGrammarParser#myBoolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesserThanBoolean(MyGrammarParser.LesserThanBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThanBoolean}
	 * labeled alternative in {@link MyGrammarParser#myBoolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanBoolean(MyGrammarParser.GreaterThanBooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MyGrammarParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MyGrammarParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MyGrammarParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(MyGrammarParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MyGrammarParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#newVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewVariable(MyGrammarParser.NewVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(MyGrammarParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(MyGrammarParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(MyGrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MyGrammarParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#multiplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(MyGrammarParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(MyGrammarParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#addition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(MyGrammarParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#subtraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(MyGrammarParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(MyGrammarParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#newline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline(MyGrammarParser.NewlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#whitespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhitespace(MyGrammarParser.WhitespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#eol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEol(MyGrammarParser.EolContext ctx);
}