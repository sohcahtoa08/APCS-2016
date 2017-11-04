/**
 * This class simulates the members and methods associated with a
 * Contact object.
 * 
 * @author Pranshu Suri
*/

public class Contact {
	
	// Attributes
	private String lastName;
	private String firstName;
	private String phoneNumber;
	private String emailAddress;
	
	// Constructor: no arguments
	public Contact() {
		
		lastName = "";
		firstName = "";
		phoneNumber = "";
		emailAddress = "";
		
	}
	
	/*
	 * Constructor: 4 arguments -> last name, first name, phone number,
	 * email address
	 */
	public Contact(String lname, String fname, String phoneNum, String eAddress) {
		
		lastName = lname;
		firstName = fname;
		phoneNumber = phoneNum;
		emailAddress = eAddress;
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		
		return lastName + ", " + firstName + ": " + phoneNumber + ", " +
				emailAddress;
		
	}
	
	// getter and setter methods
	
	/*
	 * Getter Methods-
	 * PRE-CONDITIONS: given attribute must be initialized
	 * POST-CONDITIONS: returns value for given attribute associated with
	 * Contact object
	 */
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	/*
	 * Setter Methods-
	 * PRE-CONDITIONS: none
	 * POST-CONDITIONS: sets given attribute to specified argument value
	 */
	public void setLastName(String lname) {
		lastName = lname;
	}
	
	public void setFirstName(String fname) {
		firstName = fname;
	}
	
	public void setPhoneNumebr(String phoneNum) {
		phoneNumber = phoneNum;
	}
	
	public void setEmailAddress(String eAddress) {
		emailAddress = eAddress;
	}
	
}
