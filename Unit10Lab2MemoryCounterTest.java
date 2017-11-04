/**
 * This program tests the various objects and methods in the Counter,
 * MemoryCounter, and MemoryCounterConsoleMenu classes.
 * 
 * @author Pranshu Suri
*/

import javax.swing.JOptionPane;

public class MemoryCounterTest {

	public static void main(String[] args) {
		
		// Display menu of choices with corresponding integer values
		MemoryCounterConsoleMenu console = new MemoryCounterConsoleMenu();
		
		console.displayChoices();
		
		int choice = 0;
		
		System.out.println();
		console.displayCountValue();
		console.displayMemoryCountValue();
		
		// Allow user to increment, decrement, reset, or quit
		while (choice != 6) {
			
			choice = console.getInput();
			if (choice == 1) {
				console.incrementCounter();	
			}
			else if (choice == 2) {
				console.decrementCounter();
			}
			else if (choice == 3) {
				console.resetCounter();
			}
			else if (choice == 4) {
				console.addToMemCounter();
			}
			else if (choice == 5) {
				console.resetMemCounter();
			}
			
			console.displayCountValue();
			console.displayMemoryCountValue();
			
		}
		
	}

}
