/**
 * This class simulates the members and methods associated with a Faculty object.
 * 
 * @author Pranshu Suri
*/

public class Faculty extends Employee {
	
	// attributes
	private String officeHours;
	private String rank;
	
	// constructor: no arguments
	public Faculty() {
		
		super();
		officeHours = "";
		rank = "";
		
	}
	
	/* constructor: 9 arguments -> name, address, email address, phone number
	   birthday, salary, hire date, office hours, rank */
	public Faculty(String n, String ad, String em, String pn, Date bd, double s, Date hd, String oh, String r) {
		
		super(n, ad, em, pn, bd, s, hd);
		officeHours = oh;
		rank = r;
		
	}
	
	// getter methods
	public String getOfficeHours() {
		return officeHours;
	}
	public String getRank() {
		return rank;
	}
	
	// setter methods
	public void setOfficeHours(String oh) {
		officeHours = oh;
	}
	public void setRank(String r) {
		rank = r;
	}
	
	// toString method
	public String toString() {
		
		String result;
		result = getClass().getName() + " " + this.getName();
		
		return result;
		
	}
	
}
