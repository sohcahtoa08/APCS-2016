/**
 * This program demonstrates a 'IllegalArgumentException' being thrown.
 * 
 * @author Pranshu Suri
*/

public class IllegalArgumentExceptionThrown {

	public static void main(String[] args) {
		
		printSquareRoot(-9);
		
	}
	
	/*
	 * PRE-CONDITIONS: 'num' must be positive number
	 * POST-CONDITIONS: prints square root of 'num'
	 */
	public static void printSquareRoot(double num) {
		
		if (num < 0) {
			throw new IllegalArgumentException();
		}
		else {
			System.out.println(Math.sqrt(num));
		}
		
	}

}
