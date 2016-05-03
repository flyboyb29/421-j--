package jminusminus;

import static jminusminus.CLConstants.*;

class JBreakStatement extends JStatement {


    public JBreakStatement(int line) {
        super(line);
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