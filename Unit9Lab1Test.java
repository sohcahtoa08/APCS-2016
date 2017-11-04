/**
 * This program tests the objects and methods in the Date, Name, and Person
 * classes.
 * 
 * @author Pranshu Suri
*/

public class Test {
	
	public static void main(String[] args) {
		
		Person p2 = new Person(new Name("Tony", "Baggadonuts"), new Date(10, 21, 2001));
		
		System.out.println();
		
		System.out.println(p2.getFirstName() + "\t" + p2.getLastName() + "\t"
				+ p2.getBirthDayString());
		
	}
	
}
