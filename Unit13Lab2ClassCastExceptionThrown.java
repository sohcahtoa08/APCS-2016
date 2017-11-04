/**
 * This program demonstrates a 'ClassCastException' being thrown.
 * 
 * @author Pranshu Suri
*/

public class ClassCastExceptionThrown {

	public static void main(String[] args) {
		
		Animal a = new Cat();
		Dog d = (Dog)(a);
		
	}
	
	public abstract static class Animal {
	}
	
	public static class Dog extends Animal {	
	}
	
	public static class Cat extends Animal {
	}
	
}

