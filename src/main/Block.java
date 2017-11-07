package src.main;

import org.bytedeco.javacpp.LLVM;
import src.statements.Statement;

import java.util.ArrayList;
import java.util.List;

public class Block implements Node {

    private List<Statement> statementList;

    public Block() {
        this.statementList = new ArrayList<>();
    }

    public void addStatement(Statement statement) {
        statementList.add(statement);
    }

    @Override
    public LLVM.LLVMValueRef generateCode() {
        return null;
    }
}
