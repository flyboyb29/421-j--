package jminusminus;

public class JModOp extends JBinaryExpression {
    public JModOp(int line, JExpression lhs, JExpression rhs){
        super(line, "%", lhs, rhs);
    }

    public JExpression analyze(Context context){
        this.lhs = this.lhs.analyze(context);
        this.rhs = this.rhs.analyze(context);
        this.lhs.type().mustMatchExpected(line(), Type.INT);
        this.rhs.type().mustMatchExpected(line(), Type.INT);
        this.type = Type.INT;
        return this;
    }

    public void codegen(CLEmitter output){
        this.lhs.codegen(output);
        this.rhs.codegen(output);
        output.addNoArgInstruction(108);
    }
}