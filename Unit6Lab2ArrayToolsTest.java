/**
 * This program tests the methods in the class 'ArrayTools'
 * 
 * @author Pranshu Suri
*/

public class ArrayToolsTest extends ArrayTools {

	public static void main(String[] args) {
		
		char charArray[] = {'s', '[', 'u', '8'};
		int intArray[] = {1, 2, 3, 4};
		double doubleArray[] = {2.72, 3.14, 0.59, 1.11};
		
		System.out.println(minimum(charArray));     // Should be 8
		System.out.println(minimum(intArray));      // Should be 1
		System.out.println(minimum(doubleArray));   // Should be 0.59
		
		System.out.println();
		
		System.out.println(maximum(charArray));     // Should be u
		System.out.println(maximum(intArray));      // Should be 4
		System.out.println(maximum(doubleArray));   // Should be 3.14
		
		System.out.println();
		
		System.out.println(minimumAt(charArray));   // Should be 3
		System.out.println(minimumAt(intArray));    // Should be 0
		System.out.println(minimumAt(doubleArray)); // Should be 2
		
		System.out.println();
		
		System.out.println(maximumAt(charArray));   // Should be 2
		System.out.println(maximumAt(intArray));    // Should be 3
		System.out.println(maximumAt(doubleArray)); // Should be 1
		
		System.out.println();
		
		System.out.println(average(intArray));      // Should be 2.5
		System.out.println(average(doubleArray));   // Should be 1.89
		
	}

}
