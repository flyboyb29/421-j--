package jminusminus;

import static jminusminus.CLConstants.*;

class JForStatement extends JStatement {


    private JExpression check;
    private JStatement body;
    private JExpression update;
    private JStatement initial;


    public JForStatement(int line, JStatement initial, JExpression test, JExpression update, JStatement body) {
        super(line);
        this.initial = initial;
        this.check = test;
        this.update = update;
        this.body = body;
    }



    public JForStatement analyze(Context context) {
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