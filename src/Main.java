package src;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenFactory;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.UnbufferedCharStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import src.pandora.antlr.PandoraLexer;
import src.pandora.antlr.PandoraParser;
import src.pandora.antlr.listeners.PandoraGlobalListener;

import java.io.FileInputStream;

public class Main {
  public static void main(String[] args) {
    try {
      CharStream input = new UnbufferedCharStream(new FileInputStream("./samples/variables.pan"));

      PandoraLexer lexer = new PandoraLexer(input);
      lexer.setTokenFactory(new CommonTokenFactory(true));
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      PandoraParser parser = new PandoraParser(tokens);

      PandoraParser.ChunkContext chunkContext = parser.chunk();

      ParseTreeWalker walker = new ParseTreeWalker();
      walker.walk(new PandoraGlobalListener(), chunkContext);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
