package src.pandora.antlr.listeners;

import org.antlr.v4.runtime.Token;
import src.pandora.antlr.PandoraParser;

public class Variable {
    private String type;
    private PandoraParser.ExpContext value;

    public Variable(PandoraParser.ExpContext value) {
        this.value = value;
    }

    public String getType() {
        return this.type;
    }

    public PandoraParser.ExpContext getValue() {
        return value;
    }
}
