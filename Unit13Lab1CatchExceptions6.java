/**
 * This program provides an example of throwing and catching a
 * 'DivideByZeroException'
 * 
 * @author Pranshu Suri
*/

import java.util.*;

public class CatchExceptions6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = 0;
		
		try {
			divide(10,0);
		}
		catch (DivideByZeroException e) {
			System.out.print("Denominator must be nonzero...");
			// Allow user multiple tries to enter nonzero divisor
			while (n == 0) {
				try {
					System.out.print("enter again: ");
					n = input.nextInt();
					divide(10, n);
				}
				catch (DivideByZeroException ex) {
					System.out.print("Denominator must be nonzero...");
				}
			}
			
		}
		
	}
	
	/*
	 * PRE-CONDITIONS: requires 2 int arguments
	 * POST-CONDITIONS: returns int value of first argument divided by second
	 */
	public static int divide(int x, int y) throws DivideByZeroException {
		int result = 0;
		try {
			result = x / y;
		}
		catch (ArithmeticException e) {
			throw new DivideByZeroException(y);
		}
		
		return y;
	}

}
