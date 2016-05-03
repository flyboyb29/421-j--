package jminusminus;

import static jminusminus.CLConstants.*;

class JSwitchCaseStatement extends JStatement {


    private JExpression label;
    private JStatement body;


    public JSwitchCaseStatement(int line, JExpression label, JStatement body) {
        super(line);
        this.label = label;
        this.body = body;
    }


    public JStatement analyze(Context context) {
        return this;
    }

    public void codegen(CLEmitter output) {
    }

    /**
     * @inheritDoc
     */

    public void writeToStdOut(PrettyPrinter p) {
    }

}