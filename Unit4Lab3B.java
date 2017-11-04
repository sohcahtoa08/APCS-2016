/**
 * This program prompts the user for 10 integers and outputs the
 * largest and smallest of the integers using a for loop.
 * 
 * @author Pranshu Suri
*/

import java.util.Scanner;

public class Unit4Lab3B {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Initialize all variables
		int number = 0;
		int smallest = 2147483647;
		int largest = -2147483648;
		
		// Repeat body of for loop 10 times
		for (int counter = 1; counter <= 10; counter++) {
			
			// Prompt user to enter integer
			System.out.print(counter + ". Enter an integer: ");
			number = input.nextInt();
			
			// Update values for 'smallest' and 'largest' based on current 'number'
			if (number > largest) {
				largest = number;
			}
			if (number < smallest) {
				smallest = number;
			}
			
		}
		
		// Print largest and smallest integers
		System.out.println("------------------------\nLargest Integer: " 
				+ largest + "\nSmallest Integer: " + smallest);
		
	}

}
