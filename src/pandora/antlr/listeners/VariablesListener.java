package src.pandora.antlr.listeners;

import org.antlr.v4.runtime.tree.TerminalNode;
import src.main.ModuleCreator;
import src.pandora.antlr.PandoraParser;

import java.util.*;
import java.util.stream.IntStream;

public class VariablesListener {

    private ModuleCreator moduleCreator;

    public VariablesListener(ModuleCreator moduleCreator) {
        this.moduleCreator = moduleCreator;
    }

    public void checkAlreadyDefinied(PandoraParser.DefinitionContext ctx, Stack<HashMap<String, Variable>> blockStack) {
        ctx.namelist().NAME().forEach(nameToken -> {
            if ((blockStack.peek()).containsKey(nameToken.getText())) {
                throw new RuntimeException("Variable <" + nameToken.getText() + "> already was defined");
            }
        });
    }

    public void checkDefinitionSides(PandoraParser.DefinitionContext ctx, Stack<HashMap<String, Variable>> blockStack) {
        List<TerminalNode> nameList = ctx.namelist().NAME();
        List<PandoraParser.ExpContext> expList = ctx.explist().exp();

        if (nameList.size() != expList.size()) {
            throw new RuntimeException("Left definition size has <" +
                    nameList.size() + "> not matching with right <" + expList.size() + ">");
        }
    }

    public void checkAssignmentSides(PandoraParser.AssignmentContext ctx, Stack<HashMap<String, Variable>> blockStack) {
        List<TerminalNode> nameList = ctx.namelist().NAME();
        List<PandoraParser.ExpContext> expList = ctx.explist().exp();

        if (nameList.size() != expList.size()) {
            throw new RuntimeException("Left assigment size has <" +
                    nameList.size() + "> not matching with right <" + expList.size() + ">");
        }
    }

    public void saveDefinition(PandoraParser.DefinitionContext ctx, Stack<HashMap<String, Variable>> blockStack) {
        List<TerminalNode> nameList = ctx.namelist().NAME();
        List<PandoraParser.ExpContext> expList = ctx.explist().exp();

        this.saveVariable(nameList, expList, blockStack);
    }

    public void saveAssignment(PandoraParser.AssignmentContext ctx, Stack<HashMap<String, Variable>> blockStack) {
        List<TerminalNode> nameList = ctx.namelist().NAME();
        List<PandoraParser.ExpContext> expList = ctx.explist().exp();

        this.saveVariable(nameList, expList, blockStack);
    }

    public void checkNotDefined(PandoraParser.AssignmentContext ctx, Stack<HashMap<String, Variable>> blockStack) {
        ctx.namelist().NAME().forEach(nameToken -> {
            if (!blockStack.peek().containsKey(nameToken.getText())) {
                throw new RuntimeException("Variable <" + nameToken.getText() + "> ins't defined");
            }
        });
    }

    public void checkExpVariables(PandoraParser.VarOrExpContext ctx, HashMap<String, Variable> currentScope) {
        if (ctx.var() == null) {
            return;
        }

        PandoraParser.VarContext variable = ctx.var();
        String variableName = variable.NAME().getText();

        if (!currentScope.containsKey(variableName)) {
            throw new RuntimeException("Variable <" + variableName + "> isn't defined");
        }
    }

    private void saveVariable(List<TerminalNode> nameList, List<PandoraParser.ExpContext> expList, Stack<HashMap<String, Variable>> blockStack) {
        IntStream.range(0, nameList.size())
                .forEach(idx -> {
                    TerminalNode nameToken = nameList.get(idx);
                    PandoraParser.ExpContext exp = expList.get(idx);

                    blockStack.peek().put(
                            nameToken.getText(),
                            new Variable(exp));

                });
    }
}
