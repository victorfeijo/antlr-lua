public class Main {
  public static void main(String[] args) {
    try {
      ANTLRInputStream input = new ANTLRInputStream(
          new FileInputStream(args[0]));

      PandoraLexer lexer = new PandoraLexer(input);
      PandoraParser parser = new PandoraParser(new CommonTokenStream(lexer));
      parser.addParseListener(new VariablesListener());

      // Start parsing
      parser.program();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
