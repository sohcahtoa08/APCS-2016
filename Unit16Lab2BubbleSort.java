/**
 * This program sorts an int[] using the 'bubble sort' algorithm.
 * 
 * @author Pranshu Suri
*/

public class BubbleSort {

	public static void main(String[] args) {
		
		// sort array
		int[] array = {47, 11, 28, 23, 24, 17};
		bubbleSort(array);
		
	}
	
	/*
	 * PRE-CONDITIONS: 1 int[] argument
	 * POST-CONDITION: sorts array in ascending order using 'bubble sort'
	 * method and displays array after each iteration of loop
	 */
	public static void bubbleSort(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			// display pass #
			if (i < (array.length - 1)) {
				System.out.println("Pass #" + (i + 1) + ":");
			}
			
			for (int j = 1; j < (array.length - i); j++) {
				
				/* if element at higher index is lower than previous element,
				 * swap element positions
				 */
				if (array[j] < array[j-1]) {
					
					int x = array[j-1];
					array[j-1] = array[j];
					array[j] = x;
					
				}
				
				// display array
				display(array);
				System.out.println();
				
			}
			
		}
		
	}
	
	/*
	 * PRE-CONDITIONS: 1 int[] argument
	 * POST-CONDITION: displays array to console
	 */
	public static void display(int[] array) {
		
		// display each element in array separated by \t
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		
	}

}
