/**
 * This program prints the number of characters, words, sentences, and paragraphs
 * in a text file based on the input arguments of the main() method.
 * 
 * @author Pranshu Suri
*/

import java.io.*;

public class WordCount {

	public static void main(String[] args) {
		
		String textFile;
		
		// Assign 'textFile' to appropriate argument
		if (Character.toString(args[0].charAt(0)).equals("-")) {
			textFile = args[1];
		}
		else {
			textFile = args[0];
		}
		
		String arg = args[0];
		
		// Print output based on main() argument list
		for (int i = 1; i < arg.length(); i++) {
			if (Character.toString(arg.charAt(i)).equals("c")) {
				
				System.out.println(charCount(textFile));
				
			}
			
			else if (Character.toString(arg.charAt(i)).equals("w")) {
				
				System.out.println(wordCount(textFile));
				
			}
			
			else if (Character.toString(arg.charAt(i)).equals("s")) {
				
				System.out.println(sentenceCount(textFile));
				
			}
			
			else if (Character.toString(arg.charAt(i)).equals("p")) {
				
				System.out.println(paragraphCount(textFile));
				
			}
			
			
		}
		
		// If only the text file name is provided as an argument, run all 4 methods
		if (arg.equals(textFile)) {
			System.out.println(charCount(textFile));
			System.out.println(wordCount(textFile));
			System.out.println(sentenceCount(textFile));
			System.out.println(paragraphCount(textFile));
		}
		
	}
	
	// Character counter method
	public static int charCount(String fileName) {
		
		String line = null;
		String array[];
		int charCount = 0;
		
		try {
			
			FileReader fileReder = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReder);
			
			while ((line = bufferedReader.readLine()) != null) {
				
				array = line.split("");
				
				for (String object : array) {
					
					charCount++;
				
				}
			
			}
			
		}
		
		catch(FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		}
		
		catch(IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}
		
		return charCount;
		
	}
	
	// Word counter method
	public static int wordCount(String fileName) {
		
		String line = null;
		String array[];
		int wordCount = 0;
		
		try {
			
			FileReader fileReder = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReder);
			
			while ((line = bufferedReader.readLine()) != null) {
				
				array = line.split(" ");
				
				for (String object : array) {
					
					if (!object.equals(" ")) {
						
						wordCount++;
					
					}
				
				}
			
			}
			
		}
		
		catch(FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		}
		
		catch(IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}
		
		return wordCount;
		
	}
	
	// Sentence counter method
	public static int sentenceCount(String fileName) {
		
		String line = null;
		String array[];
		int sentenceCount = 0;
		
		try {
			
			FileReader fileReder = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReder);
			
			while ((line = bufferedReader.readLine()) != null) {
				
				array = line.split("");
				
				for (String object : array) {
					
					if (object.equals(".")) {
						
						sentenceCount++;
						
					}
				
				}
			
			}
			
		}
		
		catch(FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		}
		
		catch(IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}
		
		return sentenceCount;
		
	}
	
	// Paragraph counter method
	public static int paragraphCount(String fileName) {
		
		String line = null;
		String array[];
		int paragraphCount = 0;
		
		try {
			
			FileReader fileReder = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReder);
			
			while ((line = bufferedReader.readLine()) != null) {
				
				array = line.split("\n");
				
				for (String object : array) {
					
					paragraphCount++;
				
				}
			
			}
			
		}
		
		catch(FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		}
		
		catch(IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}
		
		return paragraphCount;
		
	}

}
