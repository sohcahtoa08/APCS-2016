/**
 * This program determines whether or not a string of text is a palindrome.
 * 
 * @author Pranshu Suri
*/

public class Palindromes {

	public static void main(String[] args) {
		
		// test cases
		System.out.println(testPalindrome("radar")); // true
		System.out.println(testPalindrome("able was i ere i saw elba")); // true
		System.out.println(testPalindrome("a man a plan a canal panama")); // true
		
	}
	
	/*
	 * PRE-CONDITIONS: 1 String argument
	 * POST-CONDITION: returns string without punctuation or spaces
	 */
	public static String ignoreSpacesAndPunctuation(String s) {
		
		String[] punctuation = {"'", "\\.", ",", "\\?", "!"};
		s = s.replaceAll(" ", "");
		
		for (String element : punctuation) {
			s = s.replaceAll(element, "");
		}
		
		return s;
		
	}
	
	/*
	 * PRE-CONDITIONS: 1 String argument
	 * POST-CONDITION: returns 'true' if s is a palindrome, 'false' if s
	 * is not a palindrome
	 */
	public static boolean testPalindrome(String s) {
		
		s = ignoreSpacesAndPunctuation(s);
		
		if (s.length() == 0 || s.length() == 1) {
			return true;
		}
		
		else if (s.charAt(0) == s.charAt(s.length() - 1)) {
			return testPalindrome(s.substring(1, (s.length() - 1)));
		}
		
		return false;
		
	}

}
