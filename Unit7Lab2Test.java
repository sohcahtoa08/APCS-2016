/**
 * This program tests various methods defined in 'Unit7Lab2' to convert
 * between the decimal, binary, and hexadecimal number systems
 * 
 * @author Pranshu Suri
*/

public class Unit7Lab2Test extends Unit7Lab2 {

	public static void main(String[] args) {
		
		System.out.println(binaryToDecimal("110111010")); // Should be 442
		System.out.println(binaryToHex("11111111111")); // Should be 7FF
		System.out.println(decimalToBinary(5280)); // Should be 01010010100000
		System.out.println(decimalToHex(123456789)); // Should be 75BCD15
		
	}

}
