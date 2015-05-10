package Absyn;

import java.util.*;

public class Declaration extends Absyn {
    Type type;
    IdentList identList;

    public Declaration(Type t, IdentList i) {
        type = t;
        identList = i;
    }

    public void printAST() {
        type.printAST();
        printWriter.print(" ");
        identList.printAST();
        printWriter.println(";");
    }
}