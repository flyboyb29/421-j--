package jminusminus;

public class JConditionalExp extends JExpression {

    private JExpression condition;
    private JExpression consequent;
    private JExpression alternate;
    
    public JConditionalExp(int line, JExpression condition, JExpression consequent, JExpression alternate) {
        super(line);
        this.condition = condition;
        this.consequent = consequent;
        this.alternate = alternate;
    }

    public JExpression analyze(Context context) {
        condition = (JExpression) condition.analyze(context);
        consequent = (JExpression) consequent.analyze(context);
        alternate = (JExpression) alternate.analyze(context);
        condition.type().mustMatchExpected(line(), Type.BOOLEAN);
        consequent.type().mustMatchExpected(line(),alternate.type());
        type = consequent.type();
        return this;
    }

    @Override
    public void codegen(CLEmitter output) {
    }


    /**
     * @inheritDoc
     */
    public void writeToStdOut(PrettyPrinter p) {     
    }

}