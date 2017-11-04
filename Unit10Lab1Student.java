/**
 * This class simulates the members and methods associated with a Student.
 * 
 * @author Pranshu Suri
*/

public class Student extends Person {
	
	// attributes
	private String classStatus;
	
	// constructor: no arguments
	public Student() {
		
		super();
		classStatus = "";
	
	}
	
	/* constructor: 6 arguments -> name, address, email address, phone number
	   birthday, class status */
	public Student(String n, String ad, String em, String pn, Date bd, String cs) {
		
		super(n, ad, em, pn, bd);
		classStatus = cs;
	
	}
	
	// getter methods
	public String getClassStatus() {
		return classStatus;
	}
	
	// setter methods
	public void setClassStatus(String cs) {
		classStatus = cs;
	}
	
	// toString method
	public String toString() {
		
		String result;
		result = getClass().getName() + " " + this.getName();
		
		return result;
		
	}
	
}
