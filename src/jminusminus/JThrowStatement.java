// Cody Cates

package jminusminus;

public class JThrowStatement extends JStatement {
	
	/** The thrown expression. */
    private JExpression expr;
	
	public JThrowStatement(int line, JExpression paramExpr) {
		super(line);
		// TODO Auto-generated constructor stub
		this.expr = paramExpr;
	}

	@Override
	public JAST analyze(Context arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void codegen(CLEmitter arg0) {
		// TODO Auto-generated method stub

	}

    /**
     * @inheritDoc
     */
	public void writeToStdOut(PrettyPrinter arg0) {
		// TODO Auto-generated method stub

	}
}