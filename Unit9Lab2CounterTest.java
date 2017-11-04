/**
 * This program tests the various objects and methods in the Counter and
 * CounterConsoleMenu classes.
 * 
 * @author Pranshu Suri
*/

import javax.swing.JOptionPane;

public class CounterTest {

	public static void main(String[] args) {
		
		// Display menu of choices with corresponding integer values
		CounterConsoleMenu console = new CounterConsoleMenu();
		
		console.displayChoices();
		
		int choice = 0;
		
		System.out.println();
		console.displayCountValue();
		
		// Allow user to increment, decrement, reset, or quit
		while (choice != 4) {
			
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
			
			console.displayCountValue();
			
		}
		
	}

}
