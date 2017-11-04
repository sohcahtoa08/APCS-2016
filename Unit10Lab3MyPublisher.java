/**
 * This class simulates a MyPublisher object's various attributes
 * and methods, including those inherited from the class Publisher.
 * 
 * @author Pranshu Suri
*/

public class MyPublisher extends Publisher {
	
	private int count;
	
	public MyPublisher(int mx) {
		
		super(mx);
		count = 0;
		
	}
	
	public void increment() {
		
		count++;
		
		// Notify subscribers if count >= 3
		if (count >= 3)
			notifySubscribers();
		
	}
	
}
