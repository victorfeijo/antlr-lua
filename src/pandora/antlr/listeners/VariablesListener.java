package src.pandora.antlr.listeners;

import org.antlr.v4.runtime.Token;
import src.pandora.antlr.PandoraBaseListener;
import src.pandora.antlr.PandoraParser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class VariablesListener extends PandoraBaseListener {
    private Map<String, Variable> variables;

    public VariablesListener() {
        variables = new HashMap<String, Variable>();
    }

    @Override
    public void enterDefinition(PandoraParser.DefinitionContext ctx) {
      ctx.namelist().NAME().forEach(nameToken -> {
          if(variables.get(nameToken.getText()) != null) {
              throw new RuntimeException("Variable <" + nameToken.getText() + "> already was defined");
          }
      });
    }

    @Override
    public void exitDefinition(PandoraParser.DefinitionContext ctx) {
        ctx.namelist().NAME().forEach(nameToken -> {
            variables.put(nameToken.getText(), new Variable(nameToken.getSymbol()));
        });
    }

    @Override
    public void enterAssignment(PandoraParser.AssignmentContext ctx) {
        ctx.namelist().NAME().forEach(nameToken -> {
            if(variables.get(nameToken.getText()) == null) {
                throw new RuntimeException("Variable <" + nameToken.getText() + "> ins't defined");
            }
        });
    }

    @Override
    public void exitAssignment(PandoraParser.AssignmentContext ctx) {
        ctx.namelist().NAME().forEach(nameToken -> {
          variables.put(nameToken.getText(), new Variable(nameToken.getSymbol()));
        });
    }
}
