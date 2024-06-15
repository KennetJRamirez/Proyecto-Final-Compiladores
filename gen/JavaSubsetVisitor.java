// Generated from C:/Users/Joab Ramirez/Desktop/ProyectoFinalCompiladores/src/JavaSubset.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaSubsetParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaSubsetVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JavaSubsetParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaSubsetParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(JavaSubsetParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JavaSubsetParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(JavaSubsetParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#inputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStatement(JavaSubsetParser.InputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(JavaSubsetParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JavaSubsetParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JavaSubsetParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(JavaSubsetParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaSubsetParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(JavaSubsetParser.ComparisonContext ctx);
}