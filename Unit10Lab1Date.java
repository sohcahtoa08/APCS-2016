/**
 * This class simulates the members and methods associated with a Date object.
 * 
 * @author Pranshu Suri
*/

public class Date {
	
	// attributes
	private int month;
	private int day;
	private int year;
	
	// constructor: no arguments
	public Date() {
		
		month = 0;
		day = 0;
		year = 0;
		
	}
	
	// constructor: 3 arguments -> month, day, year
	public Date(int m, int d, int y) {
		
		month = m;
		day = d;
		year = y;
		
	}
	
	// getter methods
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public int getYear() {
		return year;
	}
	
	// setter methods
	public void setMonth(int m) {
		month = m;
	}
	public void setDay(int d) {
		day = d;
	}
	public void setYear(int y) {
		year = y;
	}
	
}
