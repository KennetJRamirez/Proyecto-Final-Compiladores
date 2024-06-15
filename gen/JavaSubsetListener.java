// Generated from C:/Users/Joab Ramirez/Desktop/ProyectoFinalCompiladores/src/JavaSubset.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaSubsetParser}.
 */
public interface JavaSubsetListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JavaSubsetParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JavaSubsetParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaSubsetParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaSubsetParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(JavaSubsetParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(JavaSubsetParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JavaSubsetParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JavaSubsetParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(JavaSubsetParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(JavaSubsetParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatement(JavaSubsetParser.InputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatement(JavaSubsetParser.InputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(JavaSubsetParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(JavaSubsetParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaSubsetParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaSubsetParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JavaSubsetParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JavaSubsetParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(JavaSubsetParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(JavaSubsetParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaSubsetParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(JavaSubsetParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaSubsetParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(JavaSubsetParser.ComparisonContext ctx);
}