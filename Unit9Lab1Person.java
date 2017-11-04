/**
 * This class simulates a Person object's various attributes and methods.
 * 
 * @author Pranshu Suri
*/

public class Person {
	
	private Name fullName;
	private Date birthDay;
	
	// Get Methods
	
	// Get name
	public String getName() {
		
		return fullName.getName();
		
	}
	
	// Get first name
	public String getFirstName() {
		
		return fullName.getFirstName();
		
	}
	
	// Get last name
	public String getLastName() {
		
		return fullName.getLastName();
		
	}
	
	// Get birthday
	public String getBirthDayString() {
		
		return birthDay.getDate();
		
	}
	
	// Set Methods
	
	// Set name
	public void setName(String fname, String lname) {
		
		fullName.setFirstName(fname);
		fullName.setLastName(lname);
		
	}
	
	// Set first name
	public void setFirstName(String fname) {
		
		fullName.setFirstName(fname);
		
	}
	
	// Set last name
	public void setLastName(String lname) {
		
		fullName.setLastName(lname);
		
	}
	
	// Set birthday
	public void setBirthDay(int d, int m, int y) {
		
		birthDay.setDate(m, d, y);
		
	}
	
	// Constructor: 2 arguments - name, birthday
	public Person(Name name, Date bd) {
		
		fullName = name;
		birthDay = bd;
		
	}
	
	// Default constructor: no arguments
	public Person() {
		
		fullName = new Name("None", "None");
		birthDay = new Date(99, 99, 9999);
		
		
	}
	
}
