/**
 * This program prompts the user to enter a monetary amount (in dollars and cents) and accordingly outputs the amount of dollars, quarters, dimes, nickels, and pennies that comprise the amount.
 * 
 * @author Pranshu Suri
*/

import java.util.Scanner;

public class Unit2Lab2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount of money: ");
		
		double amount = input.nextDouble();
		
		int dollars = (int)(amount / 1);
		int cents = (int)((amount - dollars) * 100);
		int quarters = (int)(cents / 25);
		int dimes = (int)((cents - 25 * quarters) / 10);
		int nickels = (int)((cents - ((25 * quarters) + (10 * dimes))) / 5);
		int pennies = (cents - ((25 * quarters) + (10 * dimes) + (5 * nickels)));
		
		System.out.println("$" + amount + " consists of " + dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, " + pennies + " pennies");
		
	}

}
