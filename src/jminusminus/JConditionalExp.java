package jminusminus;

import static jminusminus.CLConstants.GOTO;

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
//    	condition consequent alternate
    	String elseLabel = output.createLabel();
        String endLabel = output.createLabel();
        
        condition.codegen(output, elseLabel, false);
        consequent.codegen(output);
        output.addBranchInstruction(GOTO, endLabel);
        output.addLabel(elseLabel);
        alternate.codegen(output);
        output.addLabel(endLabel);
    }


    /**
     * @inheritDoc
     */
    public void writeToStdOut(PrettyPrinter p) {     
    }

}