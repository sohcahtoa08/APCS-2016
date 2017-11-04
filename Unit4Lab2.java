/**
 * This program prompts the user to enter a number of asterisks
 * and then prints a number of asterisks over multiple lines,
 * with each consequent line having 1 less asterisk than the previous
 * line and the first line having the max number of asterisks
 * as specified by the user's input.
 * 
 * @author Pranshu Suri
*/

import java.util.Scanner;

public class Unit4Lab2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// Prompt user for max number of asterisks
		System.out.print("Please enter the maximum number of asterisks to be "
				+ "displayed: ");
		int max = input.nextInt();
		
		// Define number of asterisks for each line
		for (int numAsterisks = max - 1; numAsterisks >= 0; numAsterisks--) {
			
			// Draw asterisks in current line
			for (int i = 0; i <= numAsterisks; i++){
				System.out.print("*");
			}
			// Print line feed before moving onto next line
			System.out.println();
			
		}
		
	}

}
