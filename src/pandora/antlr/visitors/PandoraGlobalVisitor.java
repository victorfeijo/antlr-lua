package src.pandora.antlr.visitors;
import src.pandora.antlr.PandoraBaseVisitor;
import src.pandora.antlr.PandoraParser;
import src.pandora.antlr.listeners.Variable;

import java.util.HashMap;

public class PandoraGlobalVisitor extends PandoraBaseVisitor {
    private HashMap<String, Variable> variables;
    private StringBuilder codeBuffer;
    private int istCounter;

    public PandoraGlobalVisitor() {
        this.variables = new HashMap<String, Variable>();
        this.codeBuffer = new StringBuilder();
        this.istCounter = 0;
    }

    @Override
    public Object visitChunk(PandoraParser.ChunkContext ctx) {
        this.codeBuffer.append("; Main function init\n");
        this.codeBuffer.append("define i32 @main() #0 {\n");

        String mainBlock = this.visitBlock(ctx.block());
        this.codeBuffer.append(mainBlock);

        this.codeBuffer.append("ret i32 0\n");
        this.codeBuffer.append("}");

        System.out.println(this.codeBuffer.toString());

        return this.codeBuffer;
    }

    @Override
    public String visitBlock(PandoraParser.BlockContext ctx) {
        StringBuilder statBuilder = new StringBuilder();

        ctx.stat().forEach(stat -> {
            statBuilder.append(this.visitStat(stat));
        });

        return statBuilder.toString();
    }

    @Override
    public String visitStat(PandoraParser.StatContext ctx) {
        return this.visitDefinition(ctx.definition());
    }

    @Override
    public String visitDefinition(PandoraParser.DefinitionContext ctx) {
        StringBuilder definitionBuilder = new StringBuilder();
        String name = ctx.namelist().NAME(0).getText();
        PandoraParser.ExpContext value = ctx.explist().exp(0);
        Variable variable = new Variable(value, ++this.istCounter);

        this.variables.put(name, variable);

        definitionBuilder.append("%" + this.istCounter + " = alloca " + variable.getType() + ", align 4\n");
        definitionBuilder.append(this.visit(value));
        definitionBuilder.append("%" + ++this.istCounter + " = load " + variable.getType() + ", " +
                                 variable.getType() + "* %" + (this.istCounter-1) + ", align 4\n");
        definitionBuilder.append("store " + variable.getType() + " %" + this.istCounter +
                                 ", " + variable.getType() + "* %" + variable.getIst() + ", align 4\n");

        return definitionBuilder.toString();
    }

    @Override
    public String visitExp(PandoraParser.ExpContext ctx) {
        StringBuilder expBuilder = new StringBuilder();
        if (ctx.number() != null) {
            if (ctx.number().INT() != null) {
                expBuilder.append("%" + ++this.istCounter + " = alloca i32, align 4\n");
                expBuilder.append("store i32 " + ctx.number().INT().getText() + ", i32* %" + this.istCounter + ", align 4\n");
            }
        }

        return expBuilder.toString();
    }
}
