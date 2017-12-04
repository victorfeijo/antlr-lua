package src.pandora.antlr;// Generated from Pandora.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PandoraParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PandoraVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PandoraParser#chunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChunk(PandoraParser.ChunkContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PandoraParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(PandoraParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(PandoraParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#retstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetstat(PandoraParser.RetstatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(PandoraParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(PandoraParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PandoraParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#namelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamelist(PandoraParser.NamelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(PandoraParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(PandoraParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#prefixexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixexp(PandoraParser.PrefixexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(PandoraParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#varOrExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarOrExp(PandoraParser.VarOrExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(PandoraParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#varSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSuffix(PandoraParser.VarSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#nameAndArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameAndArgs(PandoraParser.NameAndArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(PandoraParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#functiondef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondef(PandoraParser.FunctiondefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#parlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParlist(PandoraParser.ParlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#tableconstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableconstructor(PandoraParser.TableconstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#fieldlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldlist(PandoraParser.FieldlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(PandoraParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#fieldsep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldsep(PandoraParser.FieldsepContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#operatorOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorOr(PandoraParser.OperatorOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#operatorAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorAnd(PandoraParser.OperatorAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#operatorComparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorComparison(PandoraParser.OperatorComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#operatorStrcat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorStrcat(PandoraParser.OperatorStrcatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#operatorAddSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorAddSub(PandoraParser.OperatorAddSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#operatorMulDivMod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorMulDivMod(PandoraParser.OperatorMulDivModContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#operatorBitwise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorBitwise(PandoraParser.OperatorBitwiseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#operatorUnary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorUnary(PandoraParser.OperatorUnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#operatorPower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorPower(PandoraParser.OperatorPowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(PandoraParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(PandoraParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(PandoraParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link PandoraParser#nil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil(PandoraParser.NilContext ctx);
}
