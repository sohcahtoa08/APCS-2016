/**
 * This program prints the calendar for a given month and year
 * using various methods.
 * 
 * @author Pranshu Suri
*/

public class Unit5Lab2 {

	public static void main(String[] args) {
		
		printMonthCalendar(2, 2012);
		
	}
	
	/*
	  The method printMonthCalendar() displays a calendar for a
	  specified month and year.
	  
	  Pre-Conditions: The month value, m,  is 1-12
	  				  The year value, y, is the full year (e.g., 2012)
	                  
	  Post-Conditions: A month calendar for month 'm' in year 'y' is printed.
	*/
	public static void printMonthCalendar(int m, int y) {
		
		printMonthHeader(m, y);
		printMonthBody(m, y);
		
	}
	
	/*
	  The method printMonthHeader() displays the header information
	  (month, year,line separator, 3-character day names) for a
	  calendar.
	  
	  Pre-Conditions: The month value, m,  is 1-12
	  				  The year value, y, is the full year (e.g., 2012)
	                  
	  Post-Conditions: A month header for month 'm' in year 'y' is printed.
	*/
	public static void printMonthHeader(int m, int y) {
		
		System.out.println("       " + getMonthName(m) + " " + y);
		System.out.println("----------------------------");
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		
	}
	
	/*
	  The method printMonthBody() displays the days in the calendar asso-
	  ciated with the corresponding days of the week.
	  
	  Pre-Conditions: The month value, m,  is 1-12
	  				  The year value, y, is the full year (e.g., 2012)
	                  
	  Post-Conditions: A month body for month 'm' in year 'y' is printed.
	*/
	public static void printMonthBody(int m, int y) {
		
		int startDay = getStartDay(m, 1, y);
		if (startDay != 7) {
			System.out.print("  ");
			for (int i = 0; i < startDay; i++) {
				System.out.print("    ");
			}
		}

		for (int i = 1; i <= getNumDaysInMonth(m, y); i++) {
			
			// Fix spacing
			if ((getStartDay(m, i, y) == 7)) {
				if (i < 10) {
					System.out.print("  ");
				}
				else {
					System.out.print(" ");
				}	
			}
			
			// Print day
			System.out.print(i);
			
			// Fix spacing
			if (i < 9) {
				System.out.print("   ");
			}
			else {
				System.out.print("  ");
			}
			
			// Move to new line if it is the end of week
			if (getStartDay(m, i, y) == 6) {
				System.out.println();
			
			}
		
		}
		
	}
	
	/*
	  The method getMonthName() uses a switch statement in determining
	  the name of the month 'm'.
	  
	  Pre-Conditions: The month value, m,  is 1-12
	                  
	  Post-Conditions: A String object containing the name of the month 'm' is returned.
	*/
	public static String getMonthName(int m) {
		  
		switch(m) {
		  case 1:
			  return "January";
		  case 2:
			  return "February";
		  case 3:
			  return "March";
		  case 4:
			  return "April";
		  case 5:
			  return "May";
		  case 6:
			  return "June";
		  case 7:
			  return "July";
		  case 8:
			  return "August";
		  case 9:
			  return "September";
		  case 10:
			  return "October";
		  case 11:
			  return "November";
		  case 12:
			  return "December";
		  default:
			  return "not a valid month";
	  }
	
	}
	
	  /*
	    The method getStartDay() implements Zeller's Algorithm for determining the day of the
	    week the first day of a month is. The method adjusts Zeller's numbering scheme
	    for day of week ( 0=Saturday, ..., 6=Friday ) to conform to a day of week number
	    that corresponds to ISO conventions (i.e., 1=Monday, ..., 7=Sunday)
	  
  	    Pre-Conditions: The month value, m,  is 1-12
	                    The day value, d, is 1-31, or 1-28, 1-29 for February
	                    The year value, y, is the full year (e.g., 2012)
	                  
	    Post-Conditions: A value of 1-7 is returned, representing the first day of the month
	                     1 = Monday, ..., 7 = Sunday
	  */
	  public static int getStartDay( int m, int d, int y ) {
	    // Adjust month number & year to fit Zeller's numbering system
	    if ( m < 3 ) {
	      m = m + 12;
	      y = y - 1;
	    }
	    
	    int k = y % 100;      // Calculate year within century
	    int j = y / 100;      // Calculate century term
	    int h = 0;            // Day number of first day in month 'm'
	    
	    h = ( d + ( 13 * ( m + 1 ) / 5 ) + k + ( k / 4 ) + ( j / 4 ) + ( 5 * j ) ) % 7;
	    
	    // Convert Zeller's value to ISO value (1 = Mon, ... , 7 = Sun )
	    int dayNum = ( ( h + 5 ) % 7 ) + 1;     
	    
	    return dayNum;
	  }
	  
	  /*
	    The method getNumDaysInMonth() uses a switch statement in determining
	    the number of days in the month 'm'.
	  
	    Pre-Conditions: The month value, m,  is 1-12
	                    The year value, y, is the full year (e.g., 2012)
	                    
	    Post-Conditions: An integer value is returned, representing the number of days
	   				     in the month 'm'.
	  */
	  public static int getNumDaysInMonth(int m, int y) {
		  
		  switch(m) {
			  case 1:
				  return 31;
			  case 2:
				  if (isLeapYear(y)) {
					  return 29;
				  }
				  else {
					  return 28;
				  }
			  case 3:
				  return 31;
			  case 4:
				  return 30;
			  case 5:
				  return 31;
			  case 6:
				  return 30;
			  case 7:
				  return 31;
			  case 8:
				  return 31;
			  case 9:
				  return 30;
			  case 10:
				  return 31;
			  case 11:
				  return 30;
			  case 12:
				  return 31;
			  default:
				  return 0;
		  }
		  
	  }
	  
	  /*
	    The method isLeapYear() using conditional statements to determine whether
	    or not the year 'y' is a leap year.
	  
	    Pre-Conditions: The year value, y, is the full year (e.g., 2012)
	                  
	    Post-Conditions: A boolean value of true or false is returned, true if the
	 	  			     year 'y' is a leap year, and false if the year 'y' is not.
	  */
	  public static boolean isLeapYear(int y) {
		  /* In order to be considered a leap year, the year must be divisible
		     by 4 and not 100, or it must be divisible by 400. */
		  if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
			  return true;
		  }
		  else {
			  return false;
		  }
	  }

}
