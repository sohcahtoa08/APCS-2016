/**
 * This program prompts the user to enter a certain number of integers
 * and displays how many times each number was entered
 * 
 * @author Pranshu Suri
*/

import java.util.Scanner;

public class Unit6Lab1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Prompt user for number of integers
		System.out.print("How many integers would you like to input? ");
		int numIntegers = input.nextInt();
		
		// Prompt user for integers
		System.out.print("Enter " + numIntegers + " integers in the "
				+ "range 1-50, inclusive (separated by spaces): ");
		
		// Create array of length 50
		int intArray[] = new int[50];
		int num;
		
		// For loop repeats for specified number of integers
		for (int i = 0; i < numIntegers; i++) {
			
			// Assign next number to 'num'
			num = input.nextInt();
			
			// Loop through all 50 elements of array
			for (int j = 0; j < intArray.length; j++) {
				
				/* If 'num' is equal to specified index of array,
				   increment that element by 1 (originally initialized to 0 */
				if (num == j) {
					
					intArray[j]++;
					
				}
				
			}
			
		}
		
		for (int i = 0; i < intArray.length; i++) {
			
			// Output number of times each number in array occurs (where number must be >= 1)
			if (intArray[i] == 1) {
				
				System.out.println(i + " occurs " + intArray[i] + " time");
				
			}
			
			else if (intArray[i] > 1) {
				
				System.out.println(i + " occurs " + intArray[i] + " times");
				
			}
			
		}
		
	}

}
