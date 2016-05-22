// Cody Cates 
package pass;

import java.lang.IllegalArgumentException;

public class ExceptionHandler {

	private ExceptionHandler() {
		super();
	}

	private static int divide(int i) throws IllegalArgumentException {
		if (i == 0) throw new IllegalArgumentException();
		return i;
	}
	
	public static void main(String[] args) {
		try {
			int retVal = divide(0);
		} catch (IllegalArgumentException e) {
			System.out.println("Caught IllegalArgumentException.");
		} finally {
			System.out.println("Finally statement reached.");
		}
	}

}
