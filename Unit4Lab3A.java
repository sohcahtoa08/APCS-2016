/**
 * This program prompts the user for 10 integers and outputs the
 * largest and smallest of the integers using a while loop.
 * 
 * @author Pranshu Suri
*/

import java.util.Scanner;

public class Unit4Lab3A {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter first integer
		System.out.print("1. Enter the first integer: ");
		
		// Initialize all variables
		int counter = 0;
		int number = 0;
		int smallest = 2147483647;
		int largest = -2147483648;
		
		// While the number of total integers is less than 11
		while (counter != 10) {
			
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
			if (counter == 10) {
				break;
			}
			else {
				System.out.print((counter + 1) + ". Enter the next integer: ");
			}
		}
		
		// Print largest and smallest integers
		System.out.println("--------------------------------\nLargest Integer: " 
				+ largest + "\nSmallest Integer: " + smallest);
		
	}

}
