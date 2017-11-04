/**
 * This program tests the objects and methods associated with the class
 * Job in coordination with LinkedLists.
 * 
 * @author Pranshu Suri
*/

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		// Declare and intitialize all variables
		Scanner input = new Scanner(System.in);
		String response = "";
		LinkedList<Job> queue = new LinkedList<Job>();
		int jobNum = 0;
		Random rnGenerator = new Random(10);
		int printTime = 0;
		
		// While response is not "quit"...
		while (!(response.equals("quit"))) {
			
			// Prompt user for input
			System.out.print("What would you like to do, add a new job (\"add\") "
					+ "or quit (\"quit\")? ");
			response = input.next();
			
			if (response.equals("add")) {
				
				/* Update 'jobNum' and 'printTime', and add new Job object to
				   LinkedList queue */
				jobNum++;
				printTime = rnGenerator.nextInt(1000) + 10;
				queue.addLast(new Job(jobNum, printTime));
				
			}
			
		}
		
		// Display all Job objects in 'queue' in the order in which they were added
		System.out.println("\nQueue:");
		
		for (Job object : queue) {
			
			System.out.println("Job ID: " + object.getJobNum() + ", Print Time: "
					+ object.getPrintTime() + " seconds");
			
		}
		
	}

}
