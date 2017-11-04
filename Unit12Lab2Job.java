/**
 * This class simulates the members and methods associated with a
 * Job object.
 * 
 * @author Pranshu Suri
*/

public class Job {
	
	// attributes
	private int jobNum;
	private int printTime;
	
	// constructor: no arguments
	public Job() {
		
		jobNum = -1;
		printTime = 0;
		
	}
	
	// constructor: 2 arguments -> job number, print time
	public Job(int num, int time) {
		
		jobNum = num;
		printTime = time;
		
	}
	
	// getter methods
	public int getJobNum() {
		
		return jobNum;
	
	}
	
	public int getPrintTime() {
		
		return printTime;
		
	}
	
	// setter methods
	public void setJobNum(int num) {
		
		jobNum = num;
		
	}
	
	public void setPrintTime(int time) {
		
		printTime = time;
		
	}
	
}
