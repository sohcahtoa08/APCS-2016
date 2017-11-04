/**
 * This class simulates a CounterConsoleMenu object's various attributes and methods.
 * 
 * @author Pranshu Suri
*/

public class CounterConsoleMenu {
	
	private Counter counter;
	
	// Default constructor: no arguments
	public CounterConsoleMenu() {
		
		counter = new Counter();
		
	}
	
	/* PRE-CONDITIONS: none
	 * POST-CONDITIONS: displays a menu of options with corresponding integer values
	 */
	public void displayChoices() {
		
		System.out.println("Increment: 1");
		System.out.println("Decrement: 2");
		System.out.println("Reset: 3");
		System.out.println("Quit: 4");
		
	}
	
	/* PRE-CONDITIONS: input value must be integer between 1 and 4, inclusive
	 * POST-CONDITIONS: returns integer value entered
	 */
	public int getInput() {
		
		int value = Input.getInt("What would you like to do? ");
		return value;
		
	}
	
	/* PRE-CONDITIONS: none
	 * POST-CONDITIONS: displays value of counter
	 */
	public void displayCountValue() {
		
		System.out.println("Count: " + counter.getCountValue());
		
	}
	
	
	/* PRE-CONDITIONS: must be invoked on Counter object
	 * POST-CONDITIONS: increments value of counter by 1
	 */
	public void incrementCounter() {
		
		counter.increment();
		
	}
	
	/* PRE-CONDITIONS: must be invoked on Counter object
	 * POST-CONDITIONS: decrements value of counter by 1
	 */
	public void decrementCounter() {
		
		counter.decrement();
		
	}
	
	/* PRE-CONDITIONS: must be invoked on Counter object
	 * POST-CONDITIONS: resets value of counter to 0
	 */
	public void resetCounter() {
		
		counter.reset();
		
	}
	
	
	
}
