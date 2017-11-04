/**
 * This program calculates various values such as final amount and
 * principal amount based on the financial function chosen by the user
 * and the values entered.
 * 
 * @author Pranshu Suri
*/

import java.util.Scanner;

public class Unit5Lab1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Prompt user to choose financial function
		System.out.print("Specify a financial function ("
				+ "\"Future Value of a Single Sum\", \"Present Value of a Single Sum\","
				+ " or \"Future Value of an Annuity\": ");
		String financialFunction = input.nextLine();
		
		/* Prompt user to enter values for Future Value of a Single Sum and
		   calculate final amount */
		if (financialFunction.equals("Future Value of a Single Sum")) {
			
			System.out.print("\nEnter the principal amount: ");
			double principal = input.nextDouble();
			
			System.out.print("Enter the interest rate, as a percent: ");
			double interestRate = input.nextDouble();
			
			System.out.print("Enter the number of years: ");
			double years = input.nextDouble();
			
			System.out.println("\n$" + FutureValueofSingleSum(principal, interestRate, years));
			
		}
		
		/* Prompt user to enter values for Present Value of a Single Sum and
		   calculate principal amount */
		else if (financialFunction.equals("Present Value of a Single Sum")) {
			
			System.out.print("\nEnter the final amount: ");
			double finalAmount = input.nextDouble();
			
			System.out.print("Enter the interest rate, as a percent: ");
			double interestRate = input.nextDouble();
			
			System.out.print("Enter the number of years: ");
			double years = input.nextDouble();
			
			System.out.println("\n$" + PresentValueofSingleSum(finalAmount, interestRate, years));
		
		}
		
		/* Prompt user to enter values for Future Value of an Annuity and
		   calculate final amount */
		else if (financialFunction.equals("Future Value of an Annuity")) {

			System.out.print("\nEnter the principal amount: ");
			double principal = input.nextDouble();
			
			System.out.print("Enter the interest rate, as a percent: ");
			double interestRate = input.nextDouble();
			
			System.out.print("Enter the number of years: ");
			double years = input.nextDouble();
			
			System.out.println("\n$" + FutureValueofAnnuity(principal, interestRate, years));
			
		}
		
	}
	
	// FutureValueofSingleSum method
	public static double FutureValueofSingleSum(double principal, double interestRate, double years) {
		
		double i = (interestRate / 100.0) / 12.0;
		double n = 12 * years;
		double F = principal * (Math.pow(1+ i, n));
		F = (Math.round(F * 100.0)) / 100.0;
		return F;
	
	}
	
	// PresentValueofSingleSum method
	public static double PresentValueofSingleSum(double finalAmount, double interestRate, double years) {
		
		double i = (interestRate / 100.0) / 12.0;
		double n = 12 * years;
		double P = finalAmount / (Math.pow((1 + i), n));
		P = (Math.round(P * 100.0)) / 100.0;
		return P;
	
	}
	
	// FutureValueofAnnuity method
	public static double FutureValueofAnnuity(double principal, double interestRate, double years) {
		
		double i = (interestRate / 100.0) / 12.0;
		double n = 12 * years;
		double F = principal * ((Math.pow(1+ i, n) - 1) / i);
		F = (Math.round(F * 100.0)) / 100.0;
		return F;
	
	}

}
