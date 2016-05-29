package jminusminus;

class JLogicalOrOp extends JBooleanBinaryExpression {
	public JLogicalOrOp(int line, JExpression lhs, JExpression rhs) {
		super(line, "||", lhs, rhs);
	}
  
	public JExpression analyze(Context context) {
		this.lhs = this.lhs.analyze(context);
		this.rhs = this.rhs.analyze(context);
		this.lhs.type().mustMatchExpected(line(), Type.BOOLEAN);
		this.rhs.type().mustMatchExpected(line(), Type.BOOLEAN);
		this.type = Type.BOOLEAN;
		return this;
	}
  
	public void codegen(CLEmitter output, String target, boolean isTrue) {
		if (isTrue) {
			String falseLabel = output.createLabel();
			this.lhs.codegen(output, falseLabel, false);
			this.rhs.codegen(output, target, true);
			output.addLabel(falseLabel);
		} else {
			this.lhs.codegen(output, target, false);
			this.rhs.codegen(output, target, false);
		}
	}
}