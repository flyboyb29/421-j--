// Cody Cates 
package pass;

import java.lang.IllegalArgumentException;

public class ExceptionHandler {

	private ExceptionHandler() {
		super();
	}

	private static void divide() throws IllegalArgumentException {
		for (int i = 10; i >= 0; i--) {
			if (i == 0) throw new IllegalArgumentException();
			System.out.print( (10/i) + ", ");
		}
	}
	
	public static void main(String[] args) {
		try {
			divide();
		} catch (IllegalArgumentException e) {
			System.out.println("Caught IllegalArgumentException.");
		} finally {
			System.out.println("Finally statement reached.");
		}
	}

}
