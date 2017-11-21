# Generated from Pandora.g4 by ANTLR 4.7
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .PandoraParser import PandoraParser
else:
    from PandoraParser import PandoraParser

# This class defines a complete generic visitor for a parse tree produced by PandoraParser.

class PandoraVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by PandoraParser#chunk.
    def visitChunk(self, ctx:PandoraParser.ChunkContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#block.
    def visitBlock(self, ctx:PandoraParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#stat.
    def visitStat(self, ctx:PandoraParser.StatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#ifstat.
    def visitIfstat(self, ctx:PandoraParser.IfstatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#retstat.
    def visitRetstat(self, ctx:PandoraParser.RetstatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#varlist.
    def visitVarlist(self, ctx:PandoraParser.VarlistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#definition.
    def visitDefinition(self, ctx:PandoraParser.DefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#assignment.
    def visitAssignment(self, ctx:PandoraParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#namelist.
    def visitNamelist(self, ctx:PandoraParser.NamelistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#explist.
    def visitExplist(self, ctx:PandoraParser.ExplistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#exp.
    def visitExp(self, ctx:PandoraParser.ExpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#prefixexp.
    def visitPrefixexp(self, ctx:PandoraParser.PrefixexpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#functioncall.
    def visitFunctioncall(self, ctx:PandoraParser.FunctioncallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#varOrExp.
    def visitVarOrExp(self, ctx:PandoraParser.VarOrExpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#var.
    def visitVar(self, ctx:PandoraParser.VarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#varSuffix.
    def visitVarSuffix(self, ctx:PandoraParser.VarSuffixContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#nameAndArgs.
    def visitNameAndArgs(self, ctx:PandoraParser.NameAndArgsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#args.
    def visitArgs(self, ctx:PandoraParser.ArgsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#functiondef.
    def visitFunctiondef(self, ctx:PandoraParser.FunctiondefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#parlist.
    def visitParlist(self, ctx:PandoraParser.ParlistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#tableconstructor.
    def visitTableconstructor(self, ctx:PandoraParser.TableconstructorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#fieldlist.
    def visitFieldlist(self, ctx:PandoraParser.FieldlistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#field.
    def visitField(self, ctx:PandoraParser.FieldContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#fieldsep.
    def visitFieldsep(self, ctx:PandoraParser.FieldsepContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#operatorOr.
    def visitOperatorOr(self, ctx:PandoraParser.OperatorOrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#operatorAnd.
    def visitOperatorAnd(self, ctx:PandoraParser.OperatorAndContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#operatorComparison.
    def visitOperatorComparison(self, ctx:PandoraParser.OperatorComparisonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#operatorStrcat.
    def visitOperatorStrcat(self, ctx:PandoraParser.OperatorStrcatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#operatorAddSub.
    def visitOperatorAddSub(self, ctx:PandoraParser.OperatorAddSubContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#operatorMulDivMod.
    def visitOperatorMulDivMod(self, ctx:PandoraParser.OperatorMulDivModContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#operatorBitwise.
    def visitOperatorBitwise(self, ctx:PandoraParser.OperatorBitwiseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#operatorUnary.
    def visitOperatorUnary(self, ctx:PandoraParser.OperatorUnaryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#operatorPower.
    def visitOperatorPower(self, ctx:PandoraParser.OperatorPowerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#number.
    def visitNumber(self, ctx:PandoraParser.NumberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#string.
    def visitString(self, ctx:PandoraParser.StringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#boolean.
    def visitBoolean(self, ctx:PandoraParser.BooleanContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PandoraParser#nil.
    def visitNil(self, ctx:PandoraParser.NilContext):
        return self.visitChildren(ctx)



del PandoraParser