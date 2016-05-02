// Cody Cates

package jminusminus;

import static jminusminus.CLConstants.*;

public class JCatchStatement extends JStatement {
	
	/** The argument to catch. */
	private JFormalParameter catchable;
	
	/** The body. */
	private JStatement body;
	
	public JCatchStatement(int line, JFormalParameter catchable, JStatement body) {
		super(line);
		this.catchable = catchable;
		this.body = body;
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
