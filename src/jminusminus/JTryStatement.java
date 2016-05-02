// Cody Cates 

package jminusminus;

import java.util.ArrayList;
import static jminusminus.CLConstants.*;


public class JTryStatement extends JStatement {
	/** The body. */
	private JStatement body;
	
	/** The following catch statements. */
	private ArrayList<JCatchStatement> catches;
	
	/** The finally statement. Nullable. */
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
