/**
 * This class simulates a Time2 object's various attributes and methods,
 * with a Time2 object representing a time in seconds.
 * 
 * @author Pranshu Suri
*/

public class Time2 {
	
	private int second;
	
	// Time2 no-argument constructor:
	// initializes each argument to 0
	public Time2() {
		this(0, 0, 0); // invoke constructor with three arguments
	}
	
	// Time2 constructor: hour supplied, minute and second defaulted to 0
	public Time2(int hour) {
		this(hour, 0, 0); // invoke constructor with three arguments
	}
	
	// Time2 constructor: hour and minute supplied, second defaulted to 0
	public Time2(int hour, int minute) {
		this(hour, minute, 0); // invoke constructor with three arguments
	}
	
	// Time2 constructor: hour, minute, and second supplied
	public Time2(int hour, int minute, int second) {
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}
		if (minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-59");
		}
		if (second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-59");
		}
		
		this.second = (hour * 3600) + (minute * 60) + (second);
	}
	
	// Time2 constructor: another Time2 object supplied
	public Time2(Time2 time) {
		this(time.getHour(), time.getMinute(), time.getSecond());
	}
	
	// Set Methods
	// set a new time value using universal time;
	// validate the data
	public void setTime(int hour, int minute, int second) {
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}
		if (minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-59");
		}
		if (second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-59");
		}
		
		this.second = (hour * 3600) + (minute * 60) + (second);
	}
	
	// validate and set hour
	public void setHour(int hour) {
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}
		
		if ((this.second / 3600) < hour) {
			this.second += (3600 * (hour - (this.second / 3600)));
		}
		else {
			this.second -= (3600 * ((this.second / 3600) - hour));
		}
	}
	
	// validate and set minute
	public void setMinute(int minute) {
		if (minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-59");
		}
		
		int currentMin = this.getMinute();
		
		if (currentMin < minute) {
			this.second += (60 * (minute - currentMin));
		}
		else {
			this.second -= (60 * (currentMin - minute));
		}
	}
	
	// validate and set second
	public void setSecond(int second) {
		if (second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-59");
		}
		
		int currentSec = this.getSecond();
		
		if (currentSec < second) {
			this.second += (second - currentSec);
		}
		else {
			this.second -= (currentSec - second);
		}
	}
	
	// Get Methods
	// get hour value
	public int getHour() {
		return (this.second / 3600);
	}
	
	// get minute value
	public int getMinute() {
		int seconds = (this.second - (3600 * (this.second / 3600)));
		return (seconds / 60);
	}
	
	// get second value
	public int getSecond() {
		int seconds = (this.second - (3600 * (this.second / 3600)));
		return (seconds - (60 * (seconds / 60)));
	}
	
	// convert to String in universal-time format (HH:MM:SS)
	public String toUniversalString() {
		return String.format(
				"%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
	// convert to String in standard-time format (H:MM:SS AM or PM)
	public String toString() {
		return String.format("%d:%02d:%02d %s",
				((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
				getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}
	
}
