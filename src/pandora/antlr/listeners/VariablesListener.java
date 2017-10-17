package src.pandora.antlr.listeners;

import src.pandora.antlr.PandoraBaseListener;
import src.pandora.antlr.PandoraParser;

import java.util.HashMap;
import java.util.Map;

public class VariablesListener extends PandoraBaseListener {
  private Map<String, String> variables;

  public VariablesListener() {
    variables = new HashMap<>();
  }

  @Override
  public void enterAssignment(PandoraParser.AssignmentContext ctx) {
  // Get variable name
    System.out.println("Entrei");
    variables.put("Chave", "Entrei");
  }

  @Override public void exitAssignment(PandoraParser.AssignmentContext ctx) {
  // Get variable name
    System.out.println("Sai");
    variables.put("Outra Chave", "Sai");
  }
}
