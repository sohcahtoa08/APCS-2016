/**
 * This program prompts the user to enter 3 values for the sides
 * of a triangle and then prints the values, as well as whether
 * or not they make up a valid triangle (and, if they do, prints
 * the type of triangle).
 * 
 * @author Pranshu Suri
*/

import java.util.Scanner;

public class Unit3Lab1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Prompt user for 3 sides
		System.out.print("Please enter 3 integer values (separated by spaces) "
				+ "for the sides of a triangle: ");
		
		// Initialize all variables
		int side1 = input.nextInt();
		int side2 = input.nextInt();
		int side3 = input.nextInt();
		boolean isValidTriangle = true;
		
		// Print 3 sides
		System.out.println("Side 1 = " + side1 + ", Side 2 = " + side2 + ", Side 3 = " + side3);
		
		// Check for conditions that would make the triangle invalid
		if ((side1 + side2 <= side3) || (side2 + side3 <= side1) 
				|| (side1 + side3 <= side2)
				|| side1 <= 0 || side2 <= 0 || side3 <= 0) {
			isValidTriangle = false;
		}
		
		// Print appropriate message
		if (isValidTriangle) {
			if (side1 == side2 && side1 == side3) {
				System.out.println("These values make an equilateral triangle.");
			}
			else if (side1 == side2 ^ side1 == side3) {
				System.out.println("These values make an isosceles triangle.");
			}
			else {
				System.out.println("These values make a scalene triangle.");
			}
		}
		else {
			System.out.println("The values entered do not make a valid triangle.");
		}
		
	}

}
