/**
 * This program tests some of the methods in the class 'ArrayTools'
 * 
 * @author Pranshu Suri
*/

public class ArrayToolsTest2 extends ArrayTools {

	public static void main(String[] args) {
		
		char charArray1[] = {'g', 'c', 'a', 'e', 'd', 'b', 'f'};
		char charArray2[] = {'g', 'c', 'a', 'e', 'z', 'b', 'f'};
		int intArray1[] = {17, 84, 32, 926, 5, 21};
		int intArray2[] = {17, 84, 32, 926, 5, 21};
		double doubleArray1[] = {2.72, 3.14, 10.59, 1.11};
		double doubleArray2[] = {2.72, 3.14, 0.59, 1.11};
		
		System.out.println(equals(charArray1, charArray2));     // Should be false
		System.out.println(equals(intArray1, intArray2));       // Should be true
		System.out.println(equals(doubleArray1, doubleArray2)); // Should be false
		
		System.out.println();
		
		System.out.println(find(charArray1, 'a'));              // Should be 2
		System.out.println(find(intArray1, 100));               // Should be -1
		System.out.println(find(doubleArray1, 1.11));           // Should be 3
		
		
		// Print unsorted arrays
		System.out.println("\nUnsorted:");

		for (char object : charArray1) {
			
			System.out.print(object + " ");
			
		}
		
		System.out.println();
		
		for (int object : intArray1) {
			
			System.out.print(object + " ");
			
		}
		
		System.out.println();
		
		for (double object : doubleArray1) {
			
			System.out.print(object + " ");
			
		}
		
		// Sort arrays
		sort(charArray1);
		sort(intArray1);
		sort(doubleArray1);
		
		// Print sorted arrays
		System.out.println("\n\nSorted:");
		
		for (char object : charArray1) {
			
			System.out.print(object + " ");
			
		}
		
		System.out.println();
		
		for (int object : intArray1) {
			
			System.out.print(object + " ");
			
		}
		
		System.out.println();
		
		for (double object : doubleArray1) {
			
			System.out.print(object + " ");
			
		}
		
	}

}
