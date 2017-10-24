package src.pandora.antlr;// Generated from Pandora.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PandoraParser}.
 */
public interface PandoraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PandoraParser#chunk}.
	 * @param ctx the parse tree
	 */
	void enterChunk(PandoraParser.ChunkContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#chunk}.
	 * @param ctx the parse tree
	 */
	void exitChunk(PandoraParser.ChunkContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PandoraParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PandoraParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(PandoraParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(PandoraParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#retstat}.
	 * @param ctx the parse tree
	 */
	void enterRetstat(PandoraParser.RetstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#retstat}.
	 * @param ctx the parse tree
	 */
	void exitRetstat(PandoraParser.RetstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(PandoraParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(PandoraParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(PandoraParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(PandoraParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PandoraParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PandoraParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#namelist}.
	 * @param ctx the parse tree
	 */
	void enterNamelist(PandoraParser.NamelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#namelist}.
	 * @param ctx the parse tree
	 */
	void exitNamelist(PandoraParser.NamelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(PandoraParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(PandoraParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(PandoraParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(PandoraParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixexp(PandoraParser.PrefixexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixexp(PandoraParser.PrefixexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(PandoraParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(PandoraParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#varOrExp}.
	 * @param ctx the parse tree
	 */
	void enterVarOrExp(PandoraParser.VarOrExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#varOrExp}.
	 * @param ctx the parse tree
	 */
	void exitVarOrExp(PandoraParser.VarOrExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(PandoraParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(PandoraParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#varSuffix}.
	 * @param ctx the parse tree
	 */
	void enterVarSuffix(PandoraParser.VarSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#varSuffix}.
	 * @param ctx the parse tree
	 */
	void exitVarSuffix(PandoraParser.VarSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#nameAndArgs}.
	 * @param ctx the parse tree
	 */
	void enterNameAndArgs(PandoraParser.NameAndArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#nameAndArgs}.
	 * @param ctx the parse tree
	 */
	void exitNameAndArgs(PandoraParser.NameAndArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(PandoraParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(PandoraParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#functiondef}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondef(PandoraParser.FunctiondefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#functiondef}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondef(PandoraParser.FunctiondefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#funcbody}.
	 * @param ctx the parse tree
	 */
	void enterFuncbody(PandoraParser.FuncbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#funcbody}.
	 * @param ctx the parse tree
	 */
	void exitFuncbody(PandoraParser.FuncbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#parlist}.
	 * @param ctx the parse tree
	 */
	void enterParlist(PandoraParser.ParlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#parlist}.
	 * @param ctx the parse tree
	 */
	void exitParlist(PandoraParser.ParlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#tableconstructor}.
	 * @param ctx the parse tree
	 */
	void enterTableconstructor(PandoraParser.TableconstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#tableconstructor}.
	 * @param ctx the parse tree
	 */
	void exitTableconstructor(PandoraParser.TableconstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#fieldlist}.
	 * @param ctx the parse tree
	 */
	void enterFieldlist(PandoraParser.FieldlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#fieldlist}.
	 * @param ctx the parse tree
	 */
	void exitFieldlist(PandoraParser.FieldlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(PandoraParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(PandoraParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#fieldsep}.
	 * @param ctx the parse tree
	 */
	void enterFieldsep(PandoraParser.FieldsepContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#fieldsep}.
	 * @param ctx the parse tree
	 */
	void exitFieldsep(PandoraParser.FieldsepContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#operatorOr}.
	 * @param ctx the parse tree
	 */
	void enterOperatorOr(PandoraParser.OperatorOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#operatorOr}.
	 * @param ctx the parse tree
	 */
	void exitOperatorOr(PandoraParser.OperatorOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#operatorAnd}.
	 * @param ctx the parse tree
	 */
	void enterOperatorAnd(PandoraParser.OperatorAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#operatorAnd}.
	 * @param ctx the parse tree
	 */
	void exitOperatorAnd(PandoraParser.OperatorAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#operatorComparison}.
	 * @param ctx the parse tree
	 */
	void enterOperatorComparison(PandoraParser.OperatorComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#operatorComparison}.
	 * @param ctx the parse tree
	 */
	void exitOperatorComparison(PandoraParser.OperatorComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#operatorStrcat}.
	 * @param ctx the parse tree
	 */
	void enterOperatorStrcat(PandoraParser.OperatorStrcatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#operatorStrcat}.
	 * @param ctx the parse tree
	 */
	void exitOperatorStrcat(PandoraParser.OperatorStrcatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#operatorAddSub}.
	 * @param ctx the parse tree
	 */
	void enterOperatorAddSub(PandoraParser.OperatorAddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#operatorAddSub}.
	 * @param ctx the parse tree
	 */
	void exitOperatorAddSub(PandoraParser.OperatorAddSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#operatorMulDivMod}.
	 * @param ctx the parse tree
	 */
	void enterOperatorMulDivMod(PandoraParser.OperatorMulDivModContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#operatorMulDivMod}.
	 * @param ctx the parse tree
	 */
	void exitOperatorMulDivMod(PandoraParser.OperatorMulDivModContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#operatorBitwise}.
	 * @param ctx the parse tree
	 */
	void enterOperatorBitwise(PandoraParser.OperatorBitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#operatorBitwise}.
	 * @param ctx the parse tree
	 */
	void exitOperatorBitwise(PandoraParser.OperatorBitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#operatorUnary}.
	 * @param ctx the parse tree
	 */
	void enterOperatorUnary(PandoraParser.OperatorUnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#operatorUnary}.
	 * @param ctx the parse tree
	 */
	void exitOperatorUnary(PandoraParser.OperatorUnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#operatorPower}.
	 * @param ctx the parse tree
	 */
	void enterOperatorPower(PandoraParser.OperatorPowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#operatorPower}.
	 * @param ctx the parse tree
	 */
	void exitOperatorPower(PandoraParser.OperatorPowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(PandoraParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(PandoraParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(PandoraParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(PandoraParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(PandoraParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(PandoraParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandoraParser#nil}.
	 * @param ctx the parse tree
	 */
	void enterNil(PandoraParser.NilContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandoraParser#nil}.
	 * @param ctx the parse tree
	 */
	void exitNil(PandoraParser.NilContext ctx);
}