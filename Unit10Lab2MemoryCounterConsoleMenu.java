/**
 * This class simulates a MemoryCounterConsoleMenu object's
 * various attributes and methods.
 * 
 * @author Pranshu Suri
*/

import java.util.Scanner;

public class MemoryCounterConsoleMenu {
	
	// attribute
	private MemoryCounter memCounter;
	
	// Default constructor: no arguments
	public MemoryCounterConsoleMenu() {
		
		memCounter = new MemoryCounter();
		
	}
	
	/* PRE-CONDITIONS: must be invoked on MemoryCounterConsoleMenu object
	 * POST-CONDITIONS: displays a menu of options with corresponding integer values
	 */
	public void displayChoices() {
		
		System.out.println("Increment: 1");
		System.out.println("Decrement: 2");
		System.out.println("Reset Counter: 3");
		System.out.println("Add to Memory Counter: 4");
		System.out.println("Reset Memory Counter: 5");
		System.out.println("Quit: 6");
		
	}
	
	/* PRE-CONDITIONS: input value must be integer between 1 and 6, inclusive
	 * must be invoked on MemoryCounterConsoleMenu object
	 * POST-CONDITIONS: returns integer value entered
	 */
	public int getInput() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("What would you like to do? ");
		int choice = input.nextInt();
		return choice;
		
	}
	
	/* PRE-CONDITIONS: must be invoked on MemoryCounterConsoleMenu object
	 * POST-CONDITIONS: displays value of counter
	 */
	public void displayCountValue() {
		
		System.out.println("Count: " + memCounter.getCountValue());
		
	}
	
	/* PRE-CONDITIONS: must be invoked on MemoryCounterConsoleMenu object
	 * POST-CONDITIONS: displays value of memory counter
	 */
	public void displayMemoryCountValue() {
		
		System.out.println("Memory Count: " + memCounter.getMemoryCountValue());
		
	}
	
	/* PRE-CONDITIONS: must be invoked on MemoryCounterConsoleMenu object
	 * POST-CONDITIONS: increments value of counter by 1
	 */
	public void incrementCounter() {
		
		memCounter.increment();
		
	}
	
	/* PRE-CONDITIONS: must be invoked on MemoryCounterConsoleMenu object
	 * POST-CONDITIONS: decrements value of counter by 1
	 */
	public void decrementCounter() {
		
		memCounter.decrement();
		
	}
	
	/* PRE-CONDITIONS: must be invoked on MemoryCounterConsoleMenu object
	 * POST-CONDITIONS: resets value of counter to 0
	 */
	public void resetCounter() {
		
		memCounter.reset();
		
	}
	
	/* PRE-CONDITIONS: must be invoked on MemoryCounterConsoleMenu object
	 * POST-CONDITIONS: adds the current value of counter to memory count
	 */
	public void addToMemCounter() {
		
		int num = memCounter.getCountValue();
		memCounter.addToMem(num);
		
	}
	
	/* PRE-CONDITIONS: must be invoked on MemoryCounterConsoleMenu object
	 * POST-CONDITIONS: resets memory count to 0
	 */
	public void resetMemCounter() {
		
		memCounter.resetMemory();
		
	}
	
}
