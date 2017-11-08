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

    public List<Variable> saveDefinition(PandoraParser.DefinitionContext ctx, Stack<HashMap<String, Variable>> blockStack) {
        List<TerminalNode> nameList = ctx.namelist().NAME();
        List<PandoraParser.ExpContext> expList = ctx.explist().exp();

        return this.saveVariable(nameList, expList, blockStack);
    }

    public List<Variable> saveAssignment(PandoraParser.AssignmentContext ctx, Stack<HashMap<String, Variable>> blockStack) {
        List<TerminalNode> nameList = ctx.namelist().NAME();
        List<PandoraParser.ExpContext> expList = ctx.explist().exp();

        return this.saveVariable(nameList, expList, blockStack);
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

    private List<Variable> saveVariable(List<TerminalNode> nameList, List<PandoraParser.ExpContext> expList, Stack<HashMap<String, Variable>> blockStack) {
        List<Variable> savedVariables = new ArrayList<Variable>();

        IntStream.range(0, nameList.size())
                .forEach(idx -> {
                    TerminalNode nameToken = nameList.get(idx);
                    PandoraParser.ExpContext exp = expList.get(idx);
                    Variable variable = new Variable(nameToken.getText(), exp);

                    blockStack.peek().put(
                            nameToken.getText(),
                            variable);

                    savedVariables.add(variable);
                });

        return savedVariables;
    }
}
