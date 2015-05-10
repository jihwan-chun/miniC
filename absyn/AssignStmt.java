package Absyn;

import java.util.*;

public class AssignStmt extends Stmt {
    Assign assign;

    public AssignStmt(Assign a) {
        assign = a;
    }

    public void printAST() {
        assign.printAST();
        printWriter.println(";");
    }
}