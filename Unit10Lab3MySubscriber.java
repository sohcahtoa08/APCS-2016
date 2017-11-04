/**
 * This class simulates a MySubscriber object's various attributes
 * and methods, including those inherited from the class Subscriber.
 * 
 * @author Pranshu Suri
*/

public class MySubscriber extends Subscriber {
	
	public void update(int num) {
		System.out.println("Subscriber " + num + " has been notified");
	}
	
}
