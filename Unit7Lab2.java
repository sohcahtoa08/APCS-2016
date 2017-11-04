/**
 * This class defines various methods to convert between the decimal,
 * binary, and hexadecimal number systems
 * 
 * @author Pranshu Suri
*/

public class Unit7Lab2 {
	
	public static int binaryToDecimal(String binaryString) {
		
		String digit;
		int sum = 0;
		
		for (int i = 0; i < binaryString.length(); i++) {
			
			digit = "" + binaryString.charAt(i);
			
			if (digit.equals("1")) {
				sum += Math.pow(2, binaryString.length() - (i + 1));
			}
			
		}
		
		return sum;
		
	}
	
	public static String binaryToHex(String binaryString) {
		
		int decNum = binaryToDecimal(binaryString);
		int quotient = decNum;
		char digits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'A', 'B', 'C', 'D', 'E', 'F'};
		
		String hexNum = "";
		int remainder;
		
		while (quotient > 0) {
			
			remainder = quotient % 16;
			hexNum = digits[remainder] + hexNum;
			quotient /= 16;
			
		}
		
		return hexNum;
		
	}
	
	public static String decimalToBinary(int decimalNumber) {
		
		int quotient = decimalNumber;
		int digit;
		String binaryNum = "";
		
		for (int i = 0; true; i++) {
			
			digit = quotient % 2;
			binaryNum = digit + binaryNum;
			if (quotient == 0) {
				break;
			}
			quotient /= 2;
			
		}
		
		return binaryNum;
		
	}
	
	public static String decimalToHex(int decimalNumber) {
		
		int quotient = decimalNumber;
		char digits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'A', 'B', 'C', 'D', 'E', 'F'};
		
		String hexNum = "";
		int remainder;
		
		while (quotient > 0) {
			
			remainder = quotient % 16;
			hexNum = digits[remainder] + hexNum;
			quotient /= 16;
			
		}
		
		return hexNum;
		
	}
	
}
