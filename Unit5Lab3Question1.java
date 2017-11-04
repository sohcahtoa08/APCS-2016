/**
 * This program determines the max and min values for different
 * sets each of 3 doubles using two methods 'minimum()' and
 * 'maximum()'.
 * 
 * @author Pranshu Suri
*/

public class Question1 {

	public static void main(String[] args) {
		
		// Test Cases
		System.out.println("Minimum Value of {3, 4, 5}: " + minimum(3, 4, 5));
		System.out.println("Maximum Value of {3, 4, 5}: " + maximum(3, 4, 5) + "\n");
		
		System.out.println("Minimum Value of {6.81, 8.44, 1.23}: " + minimum(6.81, 8.44, 1.23));
		System.out.println("Maximum Value of {6.81, 8.44, 1.23}: " + maximum(6.81, 8.44, 1.23) + "\n");
		
		System.out.println("Minimum Value of {8357, 5280, 1243}: " + minimum(8357, 5280, 1243));
		System.out.println("Maximum Value of {8357, 5280, 1243}: " + maximum(8357, 5280, 1243));
		
	}
	
	/*
	  The method minimum() determines the minimum value of three numbers.
	  
	  Pre-Conditions: Each number, 'num1', 'num2', and 'num3' must be a
	  				  double or be able to be cast into a double by Java.
	                  
	  Post-Conditions: The minimum double value of the three values is
	  				   returned.
	*/
	public static double minimum(double num1, double num2, double num3) {
		
		double min = Math.min(num1, num2);
		min = Math.min(min, num3);
		return min;
		
	}
	
	/*
	  The method maximum() determines the maximum value of three numbers.
	  
	  Pre-Conditions: Each number, 'num1', 'num2', and 'num3' must be a
	  				  double or be able to be cast into a double by Java.
	                  
	  Post-Conditions: The maximum double value of the three values is
	  				   returned.
	*/
	public static double maximum(double num1, double num2, double num3) {
		
		double max = Math.max(num1, num2);
		max = Math.max(max, num3);
		return max;
		
	}
	
}
