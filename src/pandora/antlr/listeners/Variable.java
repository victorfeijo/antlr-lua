package src.pandora.antlr.listeners;

import org.antlr.v4.runtime.Token;
import src.pandora.antlr.PandoraParser;

public class Variable {
    private Types type;
    private PandoraParser.ExpContext value;

    public Variable(PandoraParser.ExpContext value) {
        this.value = value;
        this.initType();
    }

    public Types getType() {
        return this.type;
    }

    public PandoraParser.ExpContext getValue() {
        return this.value;
    }

    private void initType() {
        if (this.value.nil() != null) {
            this.type = Types.NIL;
        }
        else if (this.value.string() != null) {
            this.type = Types.STRING;
        }
        else if (this.value.bool() != null) {
            this.type = Types.BOOL;
        }
        else if (this.value.number() != null) {
            if (this.value.number().INT() != null) {
                this.type = Types.INT;
            }
            else if (this.value.number().FLOAT() != null) {
                this.type = Types.FLOAT;
            }
            else if (this.value.number().HEX() != null) {
                this.type = Types.HEX;
            }
        }
        else if (this.value.tableconstructor() != null) {
            this.type = Types.TABLE;
        }
        else {
            this.type = Types.NIL;
        }
    }
}
