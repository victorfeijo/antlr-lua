package src.pandora.antlr.listeners;

import src.pandora.antlr.PandoraBaseListener;
import src.pandora.antlr.PandoraParser;
import src.pandora.antlr.listeners.FunctionListener;

import java.util.HashMap;
import java.util.Stack;

public class PandoraGlobalListener extends PandoraBaseListener {
    private Stack blockStack;
    private VariablesListener variablesListener;
    private FunctionListener functionListener;

    public PandoraGlobalListener() {
        this.blockStack = new Stack();
        this.variablesListener = new VariablesListener();
        this.functionListener = new FunctionListener();
    }

    @Override
    public void enterBlock(PandoraParser.BlockContext ctx) {
        //Something starts putting definitions on hash
        blockStack.push(new HashMap<String, Variable>());
    }

    @Override
    public void exitBlock(PandoraParser.BlockContext ctx) {
        //Something pops the definitions from hash
        blockStack.pop();
    }

    @Override
    public void enterDefinition(PandoraParser.DefinitionContext ctx) {
        this.variablesListener.checkAlreadyDefinied(ctx, this.blockStack);
    }

    @Override
    public void exitDefinition(PandoraParser.DefinitionContext ctx) {
        this.variablesListener.saveDefinition(ctx, this.blockStack);
    }

    @Override
    public void enterAssignment(PandoraParser.AssignmentContext ctx) {
        this.variablesListener.checkNotDefined(ctx, this.blockStack);
    }

    @Override
    public void exitAssignment(PandoraParser.AssignmentContext ctx) {
        this.variablesListener.saveAssignment(ctx, this.blockStack);
    }

    @Override
    public void enterFunctioncall(PandoraParser.FunctioncallContext ctx) {
        this.functionListener.checkFunctionParams(ctx, this.blockStack);
    }
}

