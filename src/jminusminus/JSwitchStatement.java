package jminusminus;

import static jminusminus.CLConstants.*;

class JSwitchStatement extends JStatement {

    private JExpression switch1;

    private JBlock block;


    public JSwitchStatement(int line, JExpression switch1, JBlock block) {
        super(line);
        this.switch1 = switch1;
        this.block = block;
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