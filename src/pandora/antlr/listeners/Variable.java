package src.pandora.antlr.listeners;

import org.antlr.v4.runtime.Token;

public class Variable {
    private String type;
    private Token value;

    public Variable(Token value) {
        this.value = value;
    }

    public String getType() {
        return this.type;
    }

    public Token getValue() {
        return value;
    }

    public void setValue(Token value) {
        this.value = value;
    }
}
