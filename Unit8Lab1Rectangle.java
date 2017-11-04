/**
 * This class simulates a rectangle's various attributes and methods.
 * 
 * @author Pranshu Suri
*/


public class Rectangle {
	
	private int length;
	private int width;
	
	public Rectangle() {
		
		length = 2;
		width = 2;
		
	}
	
	public void drawRectangle(char character) {
		
		for (int i = 0; i < length; i++) {
			
			System.out.print(character);
			
		}
		
		for (int i = 0; i < width - 2; i++) {
			
			System.out.println();
			System.out.print(character);
			
			for (int j = 0; j < length - 2; j++) {
				
				System.out.print(" ");
				
			}
			
			System.out.print(character);
			
		}
		
		System.out.println();
		
		for (int i = 0; i < length; i++) {
			
			System.out.print(character);
			
		}
		
	}
	
	public int computeArea() {
		
		return length * width;
		
	}
	
	public int computePerimeter() {
		
		return (2 * length) + (2 * width);
		
	}
	
	public void setLength(int lengthParam) {
		
		if (lengthParam > 1 && lengthParam < 30) {
			
			length = lengthParam;
			
		}
		
		else {
			
			error_message();
			
		}
		
	}
	
	public void setWidth(int widthParam) {
		
		if (widthParam > 1 && widthParam < 30) {
			
			width = widthParam;
			
		}
		
		else {
			
			error_message();
			
		}
		
	}
	
	public int getLength() {
		
		return length;
		
	}
	
	public int getWidth() {
		
		return width;
		
	}
	
	public void error_message() {
		
		System.out.println("Sorry, that number is outside of the allowed range"
				+ " for the rectangle.\nPlease pick a number between 1 and 30.");
		
	}
		
}
