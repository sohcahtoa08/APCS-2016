/**
 * This class simulates the members and methods associated with a
 * Vehicle object.
 * 
 * @author Pranshu Suri
*/

public class Vehicle implements Drawable, Rotatable, Resizable, Sounds, ManipulatableObject {
	
	// attributes
	private String name;
	private int age;
	
	/* PRE-CONDITIONS: must be invoked on Vehicle object, takes 1 String argument
	 * POST-CONDITIONS: sets 'name' equal to String argument entered
	 */
	public void setName(String n) {
		name = n;
	}
	
	/* PRE-CONDITIONS: must be invoked on Vehicle object, takes 1 int argument
	 * POST-CONDITIONS: sets 'age' equal to int argument entered
	 */
	public void setAge(int a) {
		age = a;
	}
	
	/* PRE-CONDITIONS: must be invoked on Vehicle object
	 * POST-CONDITIONS: returns name associated with Vehicle object
	 */
	public String getName() {
		return name;
	}
	
	/* PRE-CONDITIONS: must be invoked on Vehicle object
	 * POST-CONDITIONS: returns age associated with Vehicle object
	 */
	public int getAge() {
		return age;
	}
	
	/* PRE-CONDITIONS: must be invoked on Vehicle object
	 * POST-CONDITIONS: displays text 'Drawing a Vehicle'
	 */
	public void drawObject() {
		System.out.println("Drawing a Vehicle");
	}
	
	/* PRE-CONDITIONS: must be invoked on Vehicle object
	 * POST-CONDITIONS: displays text 'Rotating a Vehicle'
	 */
	public void rotateObject() {
		System.out.println("Rotating a Vehicle");
	}
	
	/* PRE-CONDITIONS: must be invoked on Vehicle object
	 * POST-CONDITIONS: displays text 'Resizing a Vehicle'
	 */
	public void resizeObject() {
		System.out.println("Resizing a Vehicle");
	}
	
	/* PRE-CONDITIONS: must be invoked on Vehicle object
	 * POST-CONDITIONS: displays text 'Vehicle sound'
	 */
	public void playSound() {
		System.out.println("Vehicle sound");
	}
	
}
