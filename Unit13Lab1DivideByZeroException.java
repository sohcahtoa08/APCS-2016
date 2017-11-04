/**
 * This class simulates the attribute and methods associated with a
 * 'DivideByZeroException' object
 * 
 * @author Pranshu Suri
*/

public class DivideByZeroException extends Exception {
	
	private int denom;
	
	// constructor: no arguments
	public DivideByZeroException() {
	}
	
	// constructor: 1 argument -> String s
	public DivideByZeroException(String s) {
		super(s);
	}
	
	// constructor 1 argument -> denominator
	public DivideByZeroException(int d) {
		super("div by zero");
		denom = d;
	}
	
	/*
	 * PRE-CONDITIONS: must be invoked on a 'DivideByZeroException' object
	 * POST-CODITIONS: returns 'denom' attribute of object
	 */
	public int getDenominator() {
		return denom;
	}
	
}
