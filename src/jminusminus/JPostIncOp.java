package jminusminus;

public class JPostIncOp extends JUnaryExpression {
    
    public JPostIncOp(int line, JExpression arg) {
        super(line, "post++", arg);
    }

    public JExpression analyze(Context context) {
        if (!(this.arg instanceof JLhs)) {
            JAST.compilationUnit.reportSemanticError(this.line, "Operand to expr++ must have an LValue.", new Object[0]);
            this.type = Type.ANY;
        } else {
            this.arg = this.arg.analyze(context);
            this.arg.type().mustMatchExpected(line(), Type.INT);
            this.type = Type.INT;
        }
        return this;
    }

    public void codegen(CLEmitter output) {
        if ((this.arg instanceof JVariable)) {
            int offset = ((LocalVariableDefn)((JVariable)this.arg).iDefn()).offset();
            if (!this.isStatementExpression) {
                this.arg.codegen(output);
            }
            output.addIINCInstruction(offset, -1);
        } else {
            ((JLhs)this.arg).codegenLoadLhsLvalue(output);
            ((JLhs)this.arg).codegenLoadLhsRvalue(output);
            if (!this.isStatementExpression) {
                ((JLhs)this.arg).codegenDuplicateRvalue(output);
            }
            output.addNoArgInstruction(4);
            output.addNoArgInstruction(100);
            ((JLhs)this.arg).codegenStore(output);
        }
    }
}