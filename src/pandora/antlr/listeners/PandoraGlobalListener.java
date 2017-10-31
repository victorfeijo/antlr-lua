package src.pandora.antlr.listeners;

import src.pandora.antlr.PandoraBaseListener;
import src.pandora.antlr.PandoraParser;
import src.pandora.antlr.listeners.FunctionListener;

import java.util.HashMap;
import java.util.Stack;

public class PandoraGlobalListener extends PandoraBaseListener {
    private Stack<HashMap<String, Variable>> blockStack;
    private VariablesListener variablesListener;
    private FunctionListener functionListener;

    public PandoraGlobalListener() {
        this.blockStack = new Stack<HashMap<String, Variable>>();
        this.variablesListener = new VariablesListener();
        this.functionListener = new FunctionListener();
    }

    @Override
    public void enterBlock(PandoraParser.BlockContext ctx) {
        if (this.blockStack.size() == 0) {
            this.blockStack.push(new HashMap<String, Variable>());
        }
        else {
            HashMap<String, Variable> nextBlock = new HashMap<String, Variable>(this.blockStack.peek());
            System.out.println(nextBlock);
            System.out.println(this.blockStack.peek());
        }
    }

    @Override
    public void exitBlock(PandoraParser.BlockContext ctx) {
        blockStack.pop();
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
}

