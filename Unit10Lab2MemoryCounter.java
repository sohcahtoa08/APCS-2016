/**
 * This class simulates a MemoryCounter object's various attributes and
 * methods, including those inherited from the Counter class.
 * 
 * @author Pranshu Suri
*/

public class MemoryCounter extends Counter {
	
	// attribute
	private int memoryCount;
	
	// constructor: no arguments
	public MemoryCounter() {
		
		memoryCount = 0;
	
	}
	
	// get memoryCount
	public int getMemoryCountValue() {
		
		return memoryCount;
		
	}
	
	// add 'num' to memoryCount
	public void addToMem(int num) {
		
		memoryCount += num;
		
	}
	
	// reset memoryCount
	public void resetMemory() {
		
		memoryCount = 0;
		
	}
	
}
