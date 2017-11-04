/**
 * This program tests the objects and methods in 4 different classes:
 * Publisher, Subscriber, MyPublisher, and MySubscriber
 * 
 * @author Pranshu Suri
*/

public class TestPattern {

	public static void main(String[] args) {
		
		// Create Publisher & Subscriber objects
		MySubscriber subscriber1 = new MySubscriber();
		MySubscriber subscriber2 = new MySubscriber();
		MySubscriber subscriber3 = new MySubscriber();
		MyPublisher aPublisher = new MyPublisher(3);
		
		// Register all subscribers
		aPublisher.register(subscriber1);
		aPublisher.register(subscriber2);
		aPublisher.register(subscriber3);
		
		// Increment Publisher object to cause state changes
		aPublisher.increment();
		aPublisher.increment();
		aPublisher.increment();
		
	}

}
