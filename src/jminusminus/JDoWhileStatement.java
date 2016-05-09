package jminusminus;

import static jminusminus.CLConstants.*;

class JDoWhileStatement extends JStatement {

    private JExpression condition;
    private JStatement body;

    public JDoWhileStatement(int line, JStatement body, JExpression condition) {
        super(line);
        this.condition = condition;
        this.body = body;
    }

    public JDoWhileStatement analyze(Context context) {
        condition = condition.analyze(context);
        condition.type().mustMatchExpected(line(), Type.BOOLEAN);
        body = (JStatement) body.analyze(context);
        return this;
    }

    public void codegen(CLEmitter output) {
        // Need two labels
        String test = output.createLabel();
        String out = output.createLabel();

        // Branch out of the loop on the test condition
        // being true
        output.addLabel(test);
        condition.codegen(output, out, true);

        // Codegen body
        body.codegen(output);

        // Unconditional jump back up to test
        output.addBranchInstruction(GOTO, test);

        // The label below and outside the loop
        output.addLabel(out);
    }

    public void writeToStdOut(PrettyPrinter p) {
        p.printf("<JDoWhileStatement line=\"%d\">\n", line());
        p.indentRight();
        p.printf("<TestExpression>\n");
        p.indentRight();
        condition.writeToStdOut(p);
        p.indentLeft();
        p.printf("</TestExpression>\n");
        p.printf("<Body>\n");
        p.indentRight();
        body.writeToStdOut(p);
        p.indentLeft();
        p.printf("</Body>\n");
        p.indentLeft();
        p.printf("</JDoWhileStatement>\n");
    }

}
