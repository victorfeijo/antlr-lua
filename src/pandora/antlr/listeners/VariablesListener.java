package src.pandora.antlr.listeners;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import src.pandora.antlr.PandoraBaseListener;
import src.pandora.antlr.PandoraParser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.IntStream;

public class VariablesListener extends PandoraBaseListener {
    private Map<String, Variable> variables;

    public VariablesListener() {
        variables = new HashMap<String, Variable>();
    }

    @Override
    public void enterDefinition(PandoraParser.DefinitionContext ctx) {
        ctx.namelist().NAME().forEach(nameToken -> {
            if (variables.get(nameToken.getText()) != null) {
                throw new RuntimeException("Variable <" + nameToken.getText() + "> already was defined");
            }
        });
    }

    @Override
    public void exitDefinition(PandoraParser.DefinitionContext ctx) {
        List<TerminalNode> nameList = ctx.namelist().NAME();
        List<PandoraParser.ExpContext> expList = ctx.explist().exp();


        IntStream.range(0, nameList.size())
                .forEach(idx -> {
                    TerminalNode nameToken = nameList.get(idx);
                    PandoraParser.ExpContext exp = expList.get(idx);

                    variables.put(nameToken.getText(), new Variable(exp));
                });
    }

    @Override
    public void enterAssignment(PandoraParser.AssignmentContext ctx) {
        ctx.namelist().NAME().forEach(nameToken -> {
            if (variables.get(nameToken.getText()) == null) {
                throw new RuntimeException("Variable <" + nameToken.getText() + "> ins't defined");
            }
        });
    }

    @Override
    public void exitAssignment(PandoraParser.AssignmentContext ctx) {
        List<TerminalNode> nameList = ctx.namelist().NAME();
        List<PandoraParser.ExpContext> expList = ctx.explist().exp();


        IntStream.range(0, nameList.size())
                .forEach(idx -> {
                    TerminalNode nameToken = nameList.get(idx);
                    PandoraParser.ExpContext exp = expList.get(idx);

                    variables.put(nameToken.getText(), new Variable(exp));
                });
    }
}
