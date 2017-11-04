/**
 * This program demonstrates a 'NullPointerException' being caught.
 * 
 * @author Pranshu Suri
*/

public class NullPointerExceptionCatch {

	public static void main(String[] args) {
		
		try {
			
			Integer x = null;
			Integer y = 5;
			System.out.println(x + y);
		
		}
		
		catch(NullPointerException e) {
			
			System.out.println("NullPointerException caught: An object cannot"
					+ " be referenced if its value is null.");
		
		}
		
	}

}
