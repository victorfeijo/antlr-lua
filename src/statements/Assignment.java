package src.statements;

import org.bytedeco.javacpp.LLVM;
import src.expressions.Expression;
import src.pandora.antlr.listeners.Variable;

/**
 * Created by andre on 07/11/17.
 */
public class Assignment implements Statement {

    private Variable lhs;
    private Expression rhs;

    public Assignment(Variable variable, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public LLVM.LLVMValueRef generateCode() {
        return null;
    }
}
