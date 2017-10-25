package src.pandora.antlr.listeners;

import org.antlr.v4.runtime.tree.TerminalNode;
import src.pandora.antlr.PandoraParser;

import java.util.*;
import java.util.stream.IntStream;

public class VariablesListener {
    public VariablesListener() { }

    public void checkAlreadyDefinied(PandoraParser.DefinitionContext ctx, Stack blockStack) {
        ctx.namelist().NAME().forEach(nameToken -> {
            if (((HashMap<String, Variable>) blockStack.peek()).containsKey(nameToken.getText())) {
                throw new RuntimeException("Variable <" + nameToken.getText() + "> already was defined");
            }
        });
    }

    public void saveDefinition(PandoraParser.DefinitionContext ctx, Stack blockStack) {
        List<TerminalNode> nameList = ctx.namelist().NAME();
        List<PandoraParser.ExpContext> expList = ctx.explist().exp();

        this.saveVariable(nameList, expList, blockStack);
    }

    public void saveAssignment(PandoraParser.AssignmentContext ctx, Stack blockStack) {
        List<TerminalNode> nameList = ctx.namelist().NAME();
        List<PandoraParser.ExpContext> expList = ctx.explist().exp();

        this.saveVariable(nameList, expList, blockStack);
    }

    public void checkNotDefined(PandoraParser.AssignmentContext ctx, Stack blockStack) {
        ctx.namelist().NAME().forEach(nameToken -> {
            if (!((HashMap<String, Variable>) blockStack.peek()).containsKey(nameToken.getText())) {
                throw new RuntimeException("Variable <" + nameToken.getText() + "> ins't defined");
            }
        });
    }

    private void saveVariable(List<TerminalNode> nameList, List<PandoraParser.ExpContext> expList, Stack blockStack) {
        IntStream.range(0, nameList.size())
                .forEach(idx -> {
                    TerminalNode nameToken = nameList.get(idx);
                    PandoraParser.ExpContext exp = expList.get(idx);

                    ((HashMap<String, Variable>) blockStack.peek()).put(nameToken.getText(), new Variable(exp));
                });
    }
}
