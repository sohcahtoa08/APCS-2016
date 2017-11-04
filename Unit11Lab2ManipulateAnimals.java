/**
 * This program tests the objects and methods associated with the classes
 * and interfaces Drawable, Rotatable, Resizable, Sounds, ManipulatableObject,
 * Animal, and Vehicle.
 * 
 * @author Pranshu Suri
*/

public class ManipulateAnimals {

	public static void main(String[] args) {
		
		// Create array of animals and vehicles
		ManipulatableObject[] objects = {
											new Animal(), new Animal(),
											new Vehicle(), new Vehicle()
										};
		
		// Iterate through array and perform methods on each object
		for (int i = 0; i < objects.length; i++) {
			
			objects[i].drawObject();
			objects[i].rotateObject();
			objects[i].resizeObject();
			objects[i].playSound();
			System.out.println();
		
		}
		
	}

}
