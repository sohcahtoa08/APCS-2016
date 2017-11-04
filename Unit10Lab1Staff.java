/**
 * This class simulates the members and methods associated with a Staff object.
 * 
 * @author Pranshu Suri
*/

public class Staff extends Employee {
	
	// attributes
	private String jobTitle;
	
	// constructor: no arguments
	public Staff() {
		
		super();
		jobTitle = "";
	
	}
	
	/* constructor: 8 arguments -> name, address, email address, phone number
	   birthday, salary, hire date, job title */
	public Staff(String n, String ad, String em, String pn, Date bd, double s, Date hd, String jt) {
		
		super(n, ad, em, pn, bd, s, hd);
		jobTitle = jt;
	
	}
	
	// getter methods
	public String getJobTitle() {
		return jobTitle;
	}
	
	// setter methods
	public void setJobTitle(String jt) {
		jobTitle = jt;
	}
	
	// toString method
	public String toString() {
		
		String result;
		result = getClass().getName() + " " + this.getName();
		
		return result;
		
	}
	
}
