package jminusminus;

public class JBComplimentOp extends JUnaryExpression {
    
    public JBComplimentOp(int line, JExpression arg) {
        super(line, "~", arg);
    }

    public JExpression analyze(Context context) {
        this.arg = this.arg.analyze(context);
        this.arg.type().mustMatchExpected(line(), Type.INT);
        this.type = Type.INT;
        return this;
    }

    public void codegen(CLEmitter output) {
    }  

    public void codegen(CLEmitter output, String targetLabel, boolean onTrue) {   
    }
}