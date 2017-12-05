package src.pandora.antlr.listeners;

import src.pandora.antlr.PandoraParser;

public class Variable {
    private String type;
    private PandoraParser.ExpContext value;
    private int ist;

    public Variable(PandoraParser.ExpContext value) {
        this.value = value;
        this.initType();
    }

    public Variable(PandoraParser.ExpContext value, int ist) {
        this.value = value;
        this.ist = ist;
        this.initType();
    }

    public String getType() {
        return this.type;
    }

    public int getIst() { return this.ist; }

    public PandoraParser.ExpContext getValue() {
        return this.value;
    }

    private void initType() {
        if (this.value.nil() != null) {
            this.type = "nil";
        }
        else if (this.value.string() != null) {
            this.type = "string";
        }
        else if (this.value.bool() != null) {
            this.type = "bool";
        }
        else if (this.value.number() != null) {
            if (this.value.number().INT() != null) {
                this.type = "i32";
            }
            else if (this.value.number().FLOAT() != null) {
                this.type = "float";
            }
            else if (this.value.number().HEX() != null) {
                this.type = "hex";
            }
        }
        else if (this.value.tableconstructor() != null) {
            this.type = "table";
        }
        else {
            this.type = "NIL";
        }
    }
}
