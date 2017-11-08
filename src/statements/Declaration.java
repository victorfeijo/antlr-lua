package src.statements;

import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.LLVM;
import org.bytedeco.javacpp.Pointer;
import src.pandora.antlr.listeners.Variable;

/**
 * Created by andre on 07/11/17.
 */
public class Declaration implements Statement {

    private LLVM.LLVMBuilderRef builder;
    private Variable variable;

    public Declaration(
            LLVM.LLVMBuilderRef builder,
            Variable variable) {

        this.builder = builder;
        this.variable = variable;
    }

    @Override
    public LLVM.LLVMValueRef generateCode() {

        return LLVM.LLVMBuildAlloca(
                builder,
                getType(),
                variable.getName());
    }

    private LLVM.LLVMTypeRef getType() {
        switch (variable.getType()) {
            case INT:
                return LLVM.LLVMInt64Type();
            case FLOAT:
            case NIL:
            case FUNCTION:
            case STRING:
            case TABLE:
            case HEX:
            case BOOL:
            default:
                return null;
        }
    }


}
