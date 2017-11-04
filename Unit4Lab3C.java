/**
 * This program prompts the user for 10 integers and outputs the
 * largest and smallest of the integers using a do-while loop.
 * 
 * @author Pranshu Suri
*/

import java.util.Scanner;

public class Unit4Lab3C {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Initialize all variables
		int counter = 0;
		int number = 0;
		int smallest = 2147483647;
		int largest = -2147483648;
		
		do {
			
			// Prompt user to enter integer
			System.out.print((counter + 1) + ". Enter an integer: ");
			number = input.nextInt();
			
			// Update values for 'smallest' and 'largest' based on current 'number'
			if (number > largest) {
				largest = number;
			}
			if (number < smallest) {
				smallest = number;
			}
			
			// Increment counter
			counter++;
		
		} while (counter < 10);
		
		// Print largest and smallest integers
		System.out.println("------------------------\nLargest Integer: " 
				+ largest + "\nSmallest Integer: " + smallest);
		
	}

}
