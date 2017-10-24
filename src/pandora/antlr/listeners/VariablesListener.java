package src.pandora.antlr.listeners;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import src.pandora.antlr.PandoraBaseListener;
import src.pandora.antlr.PandoraParser;

import java.util.*;
import java.util.stream.IntStream;

public class VariablesListener extends PandoraBaseListener {
    private Stack blockStack;
    public VariablesListener() {
        blockStack = new Stack();
    }

    @Override
    public void enterBlock(PandoraParser.BlockContext ctx) {
        //Something starts putting definitions on hash
//        System.out.println("ctx.getParent(). = " + ctx.getParent().);
        blockStack.push(new HashMap<String, Variable>());

    }
    @Override
    public void exitBlock(PandoraParser.BlockContext ctx) {
        //Something pops the definitions from hash
        blockStack.pop();
    }

    @Override
    public void enterDefinition(PandoraParser.DefinitionContext ctx) {
        ctx.namelist().NAME().forEach(nameToken -> {
            if (((HashMap<String,Variable>) blockStack.peek()).containsKey(nameToken.getText())) {
                throw new RuntimeException("Variable <" + nameToken.getText() + "> already was defined");
            }
        });
    }

    @Override
    public void exitDefinition(PandoraParser.DefinitionContext ctx) {
        List<TerminalNode> nameList = ctx.namelist().NAME();
        List<PandoraParser.ExpContext> expList = ctx.explist().exp();


        IntStream.range(0, nameList.size())
                .forEach(idx -> {
                    TerminalNode nameToken = nameList.get(idx);
                    PandoraParser.ExpContext exp = expList.get(idx);

                    ((HashMap<String,Variable>) blockStack.peek()).put(nameToken.getText(), new Variable(exp));
                });
    }

    @Override
    public void enterAssignment(PandoraParser.AssignmentContext ctx) {
        ctx.namelist().NAME().forEach(nameToken -> {
            if (!((HashMap<String,Variable>) blockStack.peek()).containsKey(nameToken.getText())) {
                throw new RuntimeException("Variable <" + nameToken.getText() + "> ins't defined");
            }
        });
    }

    @Override
    public void exitAssignment(PandoraParser.AssignmentContext ctx) {
        List<TerminalNode> nameList = ctx.namelist().NAME();
        List<PandoraParser.ExpContext> expList = ctx.explist().exp();


        IntStream.range(0, nameList.size())
                .forEach(idx -> {
                    TerminalNode nameToken = nameList.get(idx);
                    PandoraParser.ExpContext exp = expList.get(idx);
                    ((HashMap<String,Variable>) blockStack.peek()).put(nameToken.getText(), new Variable(exp));
                });
    }
}
