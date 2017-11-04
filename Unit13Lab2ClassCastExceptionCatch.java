/**
 * This program demonstrates a 'ClassCastException' being caught.
 * 
 * @author Pranshu Suri
*/

public class ClassCastExceptionCatch {

	public static void main(String[] args) {
		
		try {
			
			Animal a = new Cat();
			Dog d = (Dog)(a);
		
		}
		
		catch(ClassCastException e) {
			
			System.out.println("ClassCastException caught: Cannot cast an "
					+ "object to a type that it is not compatible with.");
			
		}
		
		
	}
	
	public abstract static class Animal {
	}
	
	public static class Dog extends Animal {	
	}
	
	public static class Cat extends Animal {
	}

}
