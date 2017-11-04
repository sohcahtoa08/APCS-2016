/**
 * This class simulates a Name object's various attributes and methods.
 * 
 * @author Pranshu Suri
*/

public class Name {
	
	private String firstName;
	private String lastName;
	
	// Default constructor: no arguments
	public Name() {
		
		firstName = "None";
		lastName = "None";
		
	}
	
	// Constructor: 2 arguments - first name, last name
	public Name(String fname, String lname) {
		
		firstName = fname;
		lastName = lname;
		
	}
	
	// Set Methods
	
	// Set name
	public void setName(String fname, String lname) {
		
		firstName = fname;
		lastName = lname;
		
	}
	
	// Set first name
	public void setFirstName(String fname) {
		
		firstName = fname;
		
	}
	
	// Set last name
	public void setLastName(String lname) {
		
		lastName = lname;
		
	}
	
	// Get Methods
	
	// Get name
	public String getName() {
		
		return firstName + " " + lastName;
		
	}
	
	// Get first name
	public String getFirstName() {
		
		return firstName;
		
	}
	
	public String getLastName() {
		
		return lastName;
		
	}
	
}
