/**
 * This class simulates the members and methods associated with an
 * Animal object.
 * 
 * @author Pranshu Suri
*/

public class Animal implements Drawable, Rotatable, Resizable, Sounds, ManipulatableObject {
	
	// attribute
	private String name;
	
	/* PRE-CONDITIONS: must be invoked on Animal object, takes 1 String argument
	 * POST-CONDITIONS: sets 'name' equal to String argument entered
	 */
	public void setName(String n) {
		name = n;
	}
	
	/* PRE-CONDITIONS: must be invoked on Animal object
	 * POST-CONDITIONS: returns name associated with Animal object
	 */
	public String getName() {
		return name;
	}
	
	/* PRE-CONDITIONS: must be invoked on Animal object
	 * POST-CONDITIONS: displays text 'Drawing an Animal'
	 */
	public void drawObject() {
		System.out.println("Drawing an Animal");
	}
	
	/* PRE-CONDITIONS: must be invoked on Animal object
	 * POST-CONDITIONS: displays text 'Rotating an Animal'
	 */
	public void rotateObject() {
		System.out.println("Rotating an Animal");
	}
	
	/* PRE-CONDITIONS: must be invoked on Animal object
	 * POST-CONDITIONS: displays text 'Resizing an Animal'
	 */
	public void resizeObject() {
		System.out.println("Resizing an Animal");
	}
	
	/* PRE-CONDITIONS: must be invoked on Animal object
	 * POST-CONDITIONS: displays text 'Animal sound'
	 */
	public void playSound() {
		System.out.println("Animal sound");
	}
	
}
