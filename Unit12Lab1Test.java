/**
 * This program tests the objects and methods associated with the class GroceryItem
 * as they are applied o ArrayLists.
 * 
 * @author Pranshu Suri
*/

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		// Create Random object and 2 ArrayLists
		Random rnGenerator = new Random(30);
		ArrayList<GroceryItem> greaterThan7 = new ArrayList<GroceryItem>();
		ArrayList<GroceryItem> lessThan8 = new ArrayList<GroceryItem>();
		
		// Create 50 GroceryItem objects and add them to appropriate ArrayList
		for (int i = 0; i <= 49; i++) {
			
			int shelfLife = rnGenerator.nextInt(30) + 1;
			
			if (shelfLife > 7) {
				greaterThan7.add(new GroceryItem((i + 1), shelfLife));
			}
			else {
				lessThan8.add(new GroceryItem((i + 1), shelfLife));
			}
			
		}
		
		// Display output
		System.out.println("The following items have a shelf life less than 8 days:");
		
		for (GroceryItem item : lessThan8) {
			System.out.println("Item Code: " + item.getItemCode() + ", Shelf Life: "
					+ item.getShelfLife());
		}
		
		System.out.println("\n\nThe following items have a shelf life greater than 7 days:");
		
		for (GroceryItem item : greaterThan7) {
			System.out.println("Item Code: " + item.getItemCode() + ", Shelf Life: "
					+ item.getShelfLife());
		}
		
	}

}
