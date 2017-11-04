/**
 * This program simulates a simple guessing game.
 * 
 * @author Pranshu Suri
*/

import java.util.Scanner;

public class Unit4Lab1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Prompt user for max value and number of guesses
		System.out.print("Enter the maximum value for the random number: ");
		int N = input.nextInt();
		System.out.print("Enter the number of guesses you would like to have: ");
		int numGuesses = input.nextInt();
		
		// Generate random number
		int number = (int)(N * Math.random()) + 1;
		
		// Initialize variables
		int guessesUsed = 0;	
		int guess = 0;
		boolean playAgain = true;
		boolean won = false;
		
		// While user is playing...
		while(playAgain) {
			// While the guesses used is less than the number of allowed guesses...
			while (guessesUsed < numGuesses) {
				// Prompt user to enter guess
				System.out.print("Enter your guess: ");
				guess = input.nextInt();
				guessesUsed ++;
				
				// User guessed correctly
				if (guess == number) {
					System.out.println("Congratulations! You guessed the number correctly in "
							+ guessesUsed + " guesses!");
					won = true;
					break;
				}
				// Guess is too low
				else if (guess < number) {
					System.out.println("Your guess is too low!");
				}
				// Guess is too high
				else if (guess > number) {
					System.out.println("Your guess is too high!");
				}
			}
			// Check to see if user guessed correctly
			if (won == false) {
				System.out.println("You've exhausted your guesses! "
						+ "The number was actually " + number + ".");
			}
			
			// Ask user if he/she wants to play again
			System.out.print("Do you want to play again? ('yes' or 'no') ");
			String response = input.next();
			playAgain = response.equalsIgnoreCase("yes");
			// If playAgain is true, reinitialize all variables and generate new number
			guessesUsed = 0;
			guess = 0;
			won = false;
			number = (int)(N * Math.random()) + 1;
		}
		
	}

}
