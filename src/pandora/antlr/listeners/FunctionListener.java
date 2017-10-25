package src.pandora.antlr.listeners;

import src.pandora.antlr.PandoraParser;

import java.util.HashMap;
import java.util.Stack;

public class FunctionListener {
    public FunctionListener() {}

    public void checkFunctionParams(PandoraParser.FunctioncallContext ctx, Stack blockStack) {
        String functionName = ctx.varOrExp().var().NAME().getText();
        PandoraParser.NameAndArgsContext firstFunctionCall = ctx.nameAndArgs().get(0);
        int paramsCount = 0;

        if (firstFunctionCall.args().explist() != null) {
            paramsCount = firstFunctionCall.args().explist().exp().size();

            Variable functionVariable = ((HashMap<String, Variable>) blockStack.peek()).get(functionName);
            int variableParamsCount = functionVariable.getValue().functiondef().parlist().namelist().NAME().size();

            if (paramsCount != variableParamsCount) {
                throw new RuntimeException("Function <" + functionName +
                        "> called with " + paramsCount + " dont match declared " + variableParamsCount + " params.");
            }
        }
    }
}
