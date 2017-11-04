/**
 * This class simulates a Counter object's various attributes and methods.
 * 
 * @author Pranshu Suri
*/

public class Counter {
	
	private int count;
	
	// Default constructor: no arguments
	public Counter() {
		
		count = 0;
		
	}
	
	/* PRE-CONDITIONS: must be invoked on Counter object
	 * POST-CONDITIONS: returns value of count
	 */
	public int getCountValue() {
		
		return count;
		
	}
	
	/* PRE-CONDITIONS: must be invoked on Counter object
	 * POST-CONDITIONS: increments count by 1
	 */
	public void increment() {
		
		count++;
		
	}
	
	/* PRE-CONDITIONS: must be invoked on Counter object
	 * POST-CONDITIONS: decrements count by 1
	 */
	public void decrement() {
		
		count--;
		
	}
	
	/* PRE-CONDITIONS: must be invoked on Counter object
	 * POST-CONDITIONS: resets count to 0
	 */
	public void reset() {
		
		count = 0;
		
	}
	
}
