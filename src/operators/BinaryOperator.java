package src.operators;

import org.bytedeco.javacpp.LLVM;
import src.expressions.Expression;

import static org.bytedeco.javacpp.LLVM.LLVMBuildAdd;

/**
 * Created by andre on 06/11/17.
 */
public class BinaryOperator implements Expression {

    private LLVM.LLVMBuilderRef builder;
    private String operator;
    private Expression lhs;
    private Expression rhs;

    public BinaryOperator(
            LLVM.LLVMBuilderRef builder,
            String operator,
            Expression lhs,
            Expression rhs) {

        this.builder = builder;
        this.operator = operator;
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public LLVM.LLVMValueRef generateCode() {
        if (operator.equals("+")) {
          return  LLVMBuildAdd(
                    builder,
                    lhs.generateCode(),
                    rhs.generateCode(),
                    "");
        }

        return null;
    }
}
