package src.pandora.antlr.listeners;

import src.main.ModuleCreator;
import src.pandora.antlr.PandoraBaseListener;
import src.pandora.antlr.PandoraParser;
import src.expressions.PFloat;
import src.expressions.PInteger;

import java.util.HashMap;
import java.util.Stack;


public class PandoraGlobalListener extends PandoraBaseListener {
    private Stack<HashMap<String, Variable>> blockStack;
    private VariablesListener variablesListener;
    private FunctionListener functionListener;
    private ModuleCreator moduleCreator;

    public PandoraGlobalListener(ModuleCreator moduleCreator) {
        this.moduleCreator = moduleCreator;
        this.blockStack = new Stack<HashMap<String, Variable>>();
        this.variablesListener = new VariablesListener(moduleCreator);
        this.functionListener = new FunctionListener();
    }

    @Override
    public void enterBlock(PandoraParser.BlockContext ctx) {
        HashMap<String, Variable> nextBlock = new HashMap<String, Variable>();

        if (this.blockStack.size() > 0) {
            nextBlock.putAll(this.blockStack.peek());
        }

        this.blockStack.push(nextBlock);
    }

    @Override
    public void exitBlock(PandoraParser.BlockContext ctx) {
        this.blockStack.pop();
    }

    @Override
    public void enterDefinition(PandoraParser.DefinitionContext ctx) {
        this.variablesListener.checkAlreadyDefinied(ctx, this.blockStack);
        this.variablesListener.checkDefinitionSides(ctx, this.blockStack);
    }

    @Override
    public void exitDefinition(PandoraParser.DefinitionContext ctx) {
        this.variablesListener.saveDefinition(ctx, this.blockStack);
    }

    @Override
    public void enterAssignment(PandoraParser.AssignmentContext ctx) {
        this.variablesListener.checkNotDefined(ctx, this.blockStack);
        this.variablesListener.checkAssignmentSides(ctx, this.blockStack);
    }

    @Override
    public void exitAssignment(PandoraParser.AssignmentContext ctx) {
        this.variablesListener.saveAssignment(ctx, this.blockStack);
    }

    @Override
    public void enterFunctioncall(PandoraParser.FunctioncallContext ctx) {
        this.functionListener.checkFunctionParams(ctx, this.blockStack);
    }

    @Override
    public void enterExp(PandoraParser.ExpContext ctx) {
        if (ctx.prefixexp() != null) {
            //this.variablesListener.checkExpVariables(ctx.prefixexp().varOrExp(), this.blockStack.peek());
        }
    }

    @Override
    public void exitExp(PandoraParser.ExpContext ctx) {
        ctx.operatorAddSub();

    }

    @Override
    public void exitNumber(PandoraParser.NumberContext ctx) {
        if(ctx.INT() != null) {
            new PInteger(Integer.parseInt(ctx.INT().toString()));
        } else if(ctx.FLOAT() != null) {
            new PFloat(Float.parseFloat(ctx.INT().toString()));
        }
    }
}

