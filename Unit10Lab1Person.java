/**
 * This class simulates the members and methods associated with a Person.
 * 
 * @author Pranshu Suri
*/

public class Person {
	
	// attributes
	private String name;
	private String address;
	private String emailAddress;
	private String phoneNumber;
	private Date birthDate;
	
	// constructor: no arguments
	public Person() {
		
		name = "";
		address = "";
		emailAddress = "";
		phoneNumber = "";
		birthDate = new Date();
		
	}
	
	// constructor: 5 arguments -> name, address, email address, phone number, birthday
	public Person(String n, String ad, String em, String pn, Date bd) {
		
		name = n;
		address = ad;
		emailAddress = em;
		phoneNumber = pn;
		birthDate = bd;
		
	}
	
	// getter methods
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	
	// setter methods
	public void setName(String n) {
		name = n;
	}
	public void setAddress(String ad) {
		address = ad;
	}
	public void setEmailAddress(String em) {
		emailAddress = em;
	}
	public void setPhoneNumber(String pn) {
		phoneNumber = pn;
	}
	public void setBirthDate(Date bd) {
		birthDate = bd;
	}
	
	// toString method
	public String toString() {
		
		String result;
		result = getClass().getName() + " " + name;
		
		return result;
		
	}
	
}
