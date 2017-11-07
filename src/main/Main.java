package src.main;

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

    private static final String SAMPLES_PATH = "./samples/";
    private static final String LANG_EXT = ".pan";

    public static void main(String[] args) {
        try {
            String filename = "int_simple_test";

            CharStream input =
                    new UnbufferedCharStream(
                            new FileInputStream(
                                    SAMPLES_PATH + filename + LANG_EXT));

            PandoraLexer lexer = new PandoraLexer(input);
            lexer.setTokenFactory(new CommonTokenFactory(true));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PandoraParser parser = new PandoraParser(tokens);

            PandoraParser.ChunkContext chunkContext = parser.chunk();
            ParseTreeWalker walker = new ParseTreeWalker();

            ModuleCreator moduleCreator = new ModuleCreator(filename);
            walker.walk(
                    new PandoraGlobalListener(moduleCreator),
                    chunkContext);
            moduleCreator.exit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
