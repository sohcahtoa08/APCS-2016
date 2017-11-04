/**
 * This class simulates the members and methods associated with an Employee.
 * 
 * @author Pranshu Suri
*/

public class Employee extends Person {
	
	// attributes
	private double salary;
	private Date hireDate;
	
	// constructor: no arguments
	public Employee() {
		
		super();
		salary = 0;
		hireDate = new Date();
		
	}
	
	/* constructor: 7 arguments -> name, address, email address, phone number
	   birthday, salary, hire date */
	public Employee(String n, String ad, String em, String pn, Date bd, double s, Date hd) {
		
		super(n, ad, em, pn, bd);
		salary = s;
		hireDate = hd;
		
	}
	
	// getter methods
	public double getSalary() {
		return salary;
	}
	public Date getHireDate() {
		return hireDate;
	}
	
	// setter methods
	public void setSalary(double s) {
		salary = s;
	}
	public void setHireDate(Date hd) {
		hireDate = hd;
	}
	
	// toString method
	public String toString() {
		
		String result;
		result = getClass().getName() + " " + this.getName();
		
		return result;
		
	}
	
}
