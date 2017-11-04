/**
 * This program demonstrates an 'IllegalArgumentException' being caught.
 * 
 * @author Pranshu Suri
*/

public class IllegalArgumentExceptionCatch {

	public static void main(String[] args) {
		
		printSquareRoot(-9);
		
	}
	
	/*
	 * PRE-CONDITIONS: 'num' must be positive number
	 * POST-CONDITIONS: prints square root of 'num'
	 */
	public static void printSquareRoot(double num) {
		
		try {
			
			if (num < 0) {
				throw new IllegalArgumentException();
			}
			else {
				System.out.println(Math.sqrt(num));
			}
		
		}
		
		catch(IllegalArgumentException e) {
			
			System.out.println("IllegalArgumentException caught: Invalid "
					+ "argument passed to method.");
			
		}
		
		
	}
	
}
