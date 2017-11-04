/**
 * This program demonstrates a 'ArrayIndexOutOfBoundsException' being caught.
 * 
 * @author Pranshu Suri
*/
public class ArrayIndexOutOfBoundsExceptionCatch {

	public static void main(String[] args) {
		
		try {
			
			String[] array = {"a", "b"};
			String x = array[2];
		
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("ArrayIndexOutOfBoundsException caught: Attempted"
					+ " to access an element with an index out of bounds of the"
					+ " array.");
			
		}
		
	}
	
}
