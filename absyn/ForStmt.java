package Absyn;

import java.util.*;

public class ForStmt extends Stmt {
	Assign initial;
	Expr condition;
	Assign next;
	Stmt body;

	public ForStmt(Assign i, Expr c, Assign n, Stmt b) {
		initial = i;
		condition = c;
		next = n;
		body = b;
	}

	public void printAST() {
		printWriter.print("for (");
		initial.printAST();
		printWriter.print("; ");
		condition.printAST();
		printWriter.print("; ");
		next.printAST();
		printWriter.println(")");

		body.printAST();
	}
}