/**
 * This class tests the objects, attributes and methods of the
 * 'Rectangle' class.
 * 
 * @author Pranshu Suri
*/

public class TestRectangle extends Rectangle {

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle();
		
		rect.setLength(10);
		rect.setWidth(5);
		
		rect.drawRectangle('*');
		
		System.out.println();
		System.out.println("Area: " + rect.computeArea()); // Should be 50
		System.out.println("Perimeter: " + rect.computePerimeter()); // Should be 30
		System.out.println("Length: " + rect.getLength()); // Should be 10
		System.out.println("Width: " + rect.getWidth()); // Should be 5
		
		rect.setLength(0);
		System.out.println("Length: " + rect.getLength()); // Should still be 10
		
	}

}
