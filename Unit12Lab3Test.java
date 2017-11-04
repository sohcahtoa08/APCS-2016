/**
 * This program tests the objects and methods associated with the classes
 * Contact and ContactList in coordination with maps and files.
 * 
 * @author Pranshu Suri
*/

import java.util.*;
import java.io.*;

public class Test {

	public static void main(String[] args) {
		
		// Initialize  & declare variables
		Scanner input = new Scanner(System.in);
		ContactList contactList = new ContactList();
		int choice = -1;
		
		// Prompt user to enter file name
		System.out.print("Enter the file name: ");
		String fileName = input.next();
		
		while (choice != 4) {
			
			// Ask user what he/she would like to do next
			System.out.print("\n1. Add a new contact\n2. Delete a contact\n"
					+ "3. Display the contact list\n4. Quit\n\nWhat would you like"
					+ " to do (1, 2, 3, 4)? ");
			choice = input.nextInt();
			
			// Add a contact & update file
			if (choice == 1) {
				
				System.out.print("New Contact-\nFirst Name: ");
				String firstName = input.next();
				System.out.print("Last Name: ");
				String lastName = input.next();
				System.out.print("Phone Number: ");
				String phoneNumber = input.next();
				System.out.print("Email Address: ");
				String emailAddress = input.next();
				
				contactList.add(new Contact(lastName, firstName, phoneNumber,
						emailAddress));
				updateFile(fileName, contactList);
				
			}
			
			// Delete a contact & update file
			else if (choice == 2) {
				
				System.out.print("Enter the first and last name of the contact"
						+ " you would like to delete ('firstName lastName'): ");
				String firstName = input.next();
				String lastName = input.next();
				contactList.remove(lastName);
				updateFile(fileName, contactList);
				
			}
			
			// Display contacts & update file
			else if (choice == 3) {
				
				System.out.println(contactList);
				updateFile(fileName, contactList);
				
			}
			
		}

	}
	
	/*
	 * PRE-CONDITIONS: 'list' must be initialized
	 * POST-CONDITIONS: updates contents of file 'fileName' based on 'list'
	 */
	public static void updateFile(String fileName, ContactList list) {
		
		try {
			
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			
			// Write contents of 'list' onto file
			String finalList = list.toString();
			bw.write(finalList);
			bw.close();
		
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
