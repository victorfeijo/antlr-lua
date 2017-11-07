package src.expressions;

import org.bytedeco.javacpp.LLVM;

import static org.bytedeco.javacpp.LLVM.LLVMConstInt;
import static org.bytedeco.javacpp.LLVM.LLVMInt32Type;

public class PInteger implements Expression {

    private int value;

    public PInteger(int value) {
        this.value = value;
    }

    @Override
    public LLVM.LLVMValueRef generateCode() {
        return LLVMConstInt(
                LLVMInt32Type(),
                this.value,
                0);
    }
}
