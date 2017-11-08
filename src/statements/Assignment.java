package src.statements;

import org.bytedeco.javacpp.LLVM;
import src.expressions.Expression;
import src.pandora.antlr.listeners.Variable;

/**
 * Created by andre on 07/11/17.
 */
public class Assignment implements Statement {

    private LLVM.LLVMBuilderRef builder;
    private Declaration lhs;
    private Expression rhs;

    public Assignment(
            LLVM.LLVMBuilderRef builder,
            Declaration lhs,
            Expression rhs) {

        this.builder = builder;
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public LLVM.LLVMValueRef generateCode() {
        return LLVM.LLVMBuildStore(
                builder,
                rhs.generateCode(),
                lhs.generateCode());
    }
}
