/**
 * This class simulates the members and methods associated with a
 * ContactList object.
 * 
 * @author Pranshu Suri
*/

import java.util.*;

public class ContactList {
	
	// Attribute
	TreeMap<String, Contact> contactList;
	
	// Constructor: no arguments
	public ContactList() {
		contactList = new TreeMap<String, Contact>();
	}
	
	// Constructor: 1 argument -> map
	public ContactList(TreeMap<String, Contact> map) {
		contactList = map;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		
		String s = "";
		
		for (Contact contact : contactList.values()) {
			
			s += contact + "\n";
			
		}
		
		System.out.println();
		return s;
		
	}
	
	/*
	 * PRE-CONDITIONS: 'contact' must be initialized
	 * POST-CONDITIONS: adds 'contact' object to map
	 */
	public void add(Contact contact) {
		contactList.put(contact.getLastName(), contact);
	}
	
	/*
	 * PRE-CONDITIONS: 'contact' must be initialized and must already be in map
	 * POST-CONDITIONS: removes 'contact' object from map
	 */
	public void remove(String lname) {
		contactList.remove(lname);
	}
	
}
