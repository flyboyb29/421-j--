package jminusminus;

class JSwitchDefaultStatement extends JStatement {

    private JStatement body;

    public JSwitchDefaultStatement(int line, JStatement body) {
        super(line);
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