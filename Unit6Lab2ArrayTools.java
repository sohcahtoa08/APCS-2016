/**
 * The ArrayTools class provides a number of static methods that
 * work on arrays of different types
 * 
 * @author Pranshu Suri
*/

public class ArrayTools {

	public static char minimum(char array[]) {
		
		char minimum = '~';
		int minValue = (int) minimum;
		
		for (char object : array) {
			
			int charValue = (int) object;
			
			if (charValue < minValue) {
				
				minimum = object;
				minValue = (int) minimum;
				
			}
			
		}
		
		return minimum;
		
	}
	
	public static int minimum(int array[]) {
		
		int minimum = 2147483647;
		
		for (int object : array) {
			
			if (object < minimum) {
				
				minimum = object;
			
			}
			
		}
		
		return minimum;
		
	}
	
	public static double minimum(double array[]) {
		
		double minimum = 2147483647;
		
		for (double object : array) {
			
			if (object < minimum) {
				
				minimum = object;
			
			}
			
		}
		
		return minimum;
		
	}
	
	public static char maximum(char array[]) {
		
		char maximum = ' ';
		int maxValue = (int) maximum;
		
		for (char object : array) {
			
			int charValue = (int) object;
			
			if (charValue > maxValue) {
				
				maximum = object;
				maxValue = (int) maximum;
				
			}
			
		}
		
		return maximum;
		
	}
	
	public static int maximum(int array[]) {
		
		int maximum = -2147483647;
		
		for (int object : array) {
			
			if (object > maximum) {
				
				maximum = object;
			
			}
			
		}
		
		return maximum;
		
	}
	
	public static double maximum(double array[]) {
		
		double maximum = -2147483647;
		
		for (double object : array) {
			
			if (object > maximum) {
				
				maximum = object;
			
			}
			
		}
		
		return maximum;
		
	}
	
	public static int minimumAt(char array[]) {
		
		int minIndex = -1;
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] == minimum(array)) {
				
				minIndex = i;
				break;
				
			}

		}
		
		return minIndex;
		
	}
	
	public static int minimumAt(int array[]) {
		
		int minIndex = -1;
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] == minimum(array)) {
				
				minIndex = i;
				break;
				
			}

		}
		
		return minIndex;
		
	}
	
	public static int minimumAt(double array[]) {
		
		int minIndex = -1;
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] == minimum(array)) {
				
				minIndex = i;
				break;
				
			}

		}
		
		return minIndex;
		
	}
	
	public static int maximumAt(char array[]) {
		
		int maxIndex = -1;
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] == maximum(array)) {
				
				maxIndex = i;
				break;
				
			}

		}
		
		return maxIndex;
		
	}
	
	public static int maximumAt(int array[]) {
		
		int maxIndex = -1;
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] == maximum(array)) {
				
				maxIndex = i;
				break;
				
			}

		}
		
		return maxIndex;
		
	}
	
	public static int maximumAt(double array[]) {
		
		int maxIndex = -1;
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] == maximum(array)) {
				
				maxIndex = i;
				break;
				
			}

		}
		
		return maxIndex;
		
	}
	
	public static double average(int array[]) {
		
		double sum = 0;
		
		for (int object : array) {
			
			sum += object;
			
		}
		
		double average = sum / (array.length);
		
		return (Math.round(average * 100.0) / 100.0);
		
	}
	
	public static double average(double array[]) {
		
		double sum = 0;
		
		for (double object : array) {
			
			sum += object;
			
		}
		
		double average = sum / (array.length);
		
		return (Math.round(average * 100.0) / 100.0);
		
	}
	
}
