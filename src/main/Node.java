package src.main;


import org.bytedeco.javacpp.LLVM;

public interface Node {
    LLVM.LLVMValueRef generateCode();
}
