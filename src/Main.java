package src;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.UnbufferedCharStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import src.pandora.antlr.PandoraLexer;
import src.pandora.antlr.PandoraParser;
import src.pandora.antlr.listeners.VariablesListener;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try {
      CharStream input = new UnbufferedCharStream(new FileInputStream("./samples/variables.pan"));

      PandoraLexer lexer = new PandoraLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      PandoraParser parser = new PandoraParser(tokens);

      PandoraParser.ChunkContext chunkContext = parser.chunk();

      ParseTreeWalker walker = new ParseTreeWalker();
      walker.walk(new VariablesListener(), chunkContext);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
