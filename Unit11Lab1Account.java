/**
 * This class simulates the members and methods associated with an
 * Account object.
 * 
 * @author Pranshu Suri
*/

// abstract class
public abstract class Account extends Date {
	
	// attributes
	private int accountNumber;
	private double accountBalance;
	private double interestRate;
	private Date dateCreated;
	
	// constructor: no arguments
	public Account() {
		
		accountNumber = 0;
		accountBalance = 0;
		interestRate = 0;
		dateCreated = new Date();
		
	}
	
	/* constructor: 4 arguments -> account number, account balance, interest rate,
	   date created */
	public Account(int accountNum, double accountBal, double interest, Date date) {
		
		accountNumber = accountNum;
		accountBalance = accountBal;
		interestRate = interest;
		dateCreated = date;
		
	}
	
	// getter methods
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	// setter methods
	public void setAccountNumber(int accountNum) {
		accountNumber = accountNum;
	}
	
	public void setAccountBalance(double accountBal) {
		accountBalance = accountBal;
	}
	
	public void setInterestRate(double interest) {
		interestRate = interest;
	}
	
	public void setDateCreated(Date date) {
		dateCreated = date;
	}
	
	// abstract methods
	public abstract void deposit(double amount);
	
	public abstract void withdraw(double amount);
	
	
	
}
