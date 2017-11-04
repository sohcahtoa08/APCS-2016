/**
 * This class simulates a Date object's various attributes and methods.
 * 
 * @author Pranshu Suri
*/

public class Date {
	
	private int month;
	private int day;
	private int year;
	
	// Default constructor: no arguments
	public Date() {
		
		month = 0;
		day = 0;
		year = 0;
		
	}
	
	// Constructor: 3 arguments - day, month, year
	public Date(int m, int d, int y) {
		
		month = m;
		day = d;
		year = y;
		
	}
	
	// Constructor: 2 arguments - month, day
	public Date(int m, int d) {
		
		month = m;
		day = d;
		year = 0;
		
	}
	
	// Constructor: 1 argument - month
	public Date(int m) {
		
		month = m;
		day = 0;
		year = 0;
		
	}
	
	// Constructor: another Date object
	public Date(Date date) {
		
		month = date.getMonth();
		day = date.getDay();
		year = date.getYear();
		
	}
	
	// Set Methods
	
	// Set a new date
	public void setDate(int m, int d, int y) {
		
		month = m;
		day = d;
		year = y;
		
	}
	
	// Set month
	public void setMonth(int m) {
		
		month = m;
		
	}
	
	// Set day
	public void setDay(int d) {
		
		day = d;
		
	}
	
	// Set year
	public void setYear(int y) {
		
		year = y;
		
	}
	
	// Get Methods
	
	// Get date
	public String getDate() {
		
		return month + "/" + day + "/" + year;	
	}
	
	// Get month
	public int getMonth() {
		
		return month;
		
	}
	
	// Get day
	public int getDay() {
		
		return day;
		
	}
	
	// Get year
	public int getYear() {
		
		return year;
		
	}
	
}
