/**
 * This class simulates the members and methods associated with a
 * GroceryItem object.
 * 
 * @author Pranshu Suri
*/

public class GroceryItem {
	
	// attributes
	private int itemCode;
	private int shelfLife;
	
	// constructor: no arguments
	public GroceryItem() {
		
		itemCode = -1;
		shelfLife = 0;
	
	}
	
	// constructor: 2 arguments -> item code, shelf life
	public GroceryItem(int code, int life) {
		
		itemCode = code;
		shelfLife = life;
		
	}
	
	// getter methods
	public int getItemCode() {
		
		return itemCode;
	
	}
	
	public int getShelfLife() {
		
		return shelfLife;
		
	}
	
	// setter methods
	public void setItemCode(int code) {
		
		itemCode = code;
		
	}
	
	public void setShelfLife(int life) {
		
		shelfLife = life;
		
	}
	
}
