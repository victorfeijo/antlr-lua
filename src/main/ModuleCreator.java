package src.main;

import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.Pointer;

import static org.bytedeco.javacpp.LLVM.*;
import static org.bytedeco.javacpp.LLVM.LLVMInitializeNativeTarget;

public class ModuleCreator {

    private static final String MODULE_EXT = "_module";

    private LLVMModuleRef module;
    private LLVMBuilderRef builder;
    private LLVMValueRef mainFunction;
    private BytePointer error;

    public ModuleCreator(String moduleName) {
        init(moduleName);
    }

    public void init(String moduleName) {
        error = new BytePointer((Pointer) null);

        LLVMLinkInMCJIT();
        LLVMInitializeNativeAsmPrinter();
        LLVMInitializeNativeAsmParser();
        LLVMInitializeNativeDisassembler();
        LLVMInitializeNativeTarget();

        module = LLVMModuleCreateWithName(moduleName + MODULE_EXT);
        builder = LLVMCreateBuilder();

        LLVMTypeRef[] args = {LLVMInt32Type()};
        mainFunction =
                LLVMAddFunction(
                        module,
                        "main",
                        LLVMFunctionType(
                                LLVMVoidType(),
                                args[0],
                                1,
                                0));

        LLVMSetFunctionCallConv(mainFunction, LLVMCCallConv);
        LLVMBasicBlockRef entry = LLVMAppendBasicBlock(mainFunction, "entry");
        LLVMPositionBuilderAtEnd(builder, entry);
    }

    public void exit() {
        LLVMBuildRetVoid(builder);

        LLVMVerifyModule(module, LLVMAbortProcessAction, error);
        LLVMDisposeMessage(error);

        LLVMExecutionEngineRef engine = new LLVMExecutionEngineRef();
        if (LLVMCreateJITCompilerForModule(engine, module, 2, error) != 0) {
            System.err.println(error.getString());
            LLVMDisposeMessage(error);
            System.exit(-1);
        }

        LLVMPassManagerRef pass = LLVMCreatePassManager();
        LLVMAddConstantPropagationPass(pass);
        LLVMAddInstructionCombiningPass(pass);
        LLVMAddPromoteMemoryToRegisterPass(pass);
//         LLVMAddDemoteMemoryToRegisterPass(pass); // Demotes every possible value to memory
        LLVMAddGVNPass(pass);
        LLVMAddCFGSimplificationPass(pass);
        LLVMRunPassManager(pass, module);
        LLVMDumpModule(module);

        LLVMGenericValueRef exec_args = LLVMCreateGenericValueOfInt(LLVMInt32Type(), 1, 0);
        LLVMGenericValueRef exec_res = LLVMRunFunction(engine, mainFunction, 1, exec_args);
        System.err.println();
        System.err.println("; Running with JIT...");
        System.err.println("; Result: " + LLVMGenericValueToInt(exec_res, 0));

        LLVMDisposePassManager(pass);
        LLVMDisposeBuilder(builder);
        LLVMDisposeExecutionEngine(engine);
    }

    public LLVMBuilderRef getBuilder() {
        return builder;
    }
}
