package src.expressions;

import org.bytedeco.javacpp.LLVM;

import static org.bytedeco.javacpp.LLVM.*;

public class PFloat implements Expression {

    private float value;

    public PFloat(float value) {
        this.value = value;
    }

    @Override
    public LLVM.LLVMValueRef generateCode() {
        return LLVMConstReal(LLVMFloatType(), this.value);
    }
}
