public class VariablesListener extends PandoraBaseListener {
  private Map<String, Integer> variables;

  public VariablesListener() {
    variables = new HashMap<>();
  }

  @Override public void enterAssignment(PandoraParser.AssignmentContext ctx) {
  // Get variable name
    System.out.println("Entrei");
    variables.put(1, "Sai");
  }

  @Override public void exitAssignment(PandoraParser.AssignmentContext ctx) {
  // Get variable name
    System.out.println("Sai");
    variables.put(1, "Sai");
  }
}
