// Cody Cates 

package jminusminus;

import java.util.ArrayList;

public class JTryStatement extends JStatement {
	/** The body. */
	private JStatement body;
	
	/** The following catch statements. */
	private ArrayList<JCatchStatement> catches;
	
	/** The finally statement. */
	private JStatement finallyBody;
	
	
	public JTryStatement(int line, JStatement body, ArrayList<JCatchStatement> catches, JStatement theFinally) {
		this(line, body, catches);
		finallyBody = theFinally;
	}
	
	public JTryStatement(int line, JStatement body, ArrayList<JCatchStatement> catches) {
		super(line);
		this.body = body;
		this.catches = catches;
		finallyBody = null;
	}
	
	@Override
	public JTryStatement analyze(Context context) {
		// TODO Auto-generated method stub
		body = (JStatement) body.analyze(context);
		
		if (finallyBody != null) finallyBody = (JStatement) finallyBody.analyze(context);
		return this;
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