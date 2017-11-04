/**
 * This class simulates the members and methods associated with a
 * CheckingAccount object.
 * 
 * @author Pranshu Suri
*/

public class CheckingAccount extends Account {
	
	// Attribute: overdraftLimit
	private double overdraftLimit;
	
	// constructor: no arguments
	public CheckingAccount() {
		
		super();
		overdraftLimit = 0;
		
	}
	
	/* constructor: 5 arguments -> account number, account balance, interest rate,
	   date created, overdraft limit */
	public CheckingAccount(int accountNum, double accountBal, double interest,
			Date date, double limit) {
		
		super(accountNum, accountBal, interest, date);
		overdraftLimit = limit;
		
	}
	
	// deposit method
	public void deposit(double amount) {
		
		double currentAmount = this.getAccountBalance();
		this.setAccountBalance((currentAmount + amount));
	
	}
	
	// withdraw method
	public void withdraw(double amount) {
		
		double currentAmount = this.getAccountBalance();
		/* don't withdraw if, after withdrawal, the absolute value of the
		   account balance is greater than the overdraft limit */
		if (currentAmount - amount < 0) {
			if (-1 * (currentAmount - amount) > overdraftLimit) {
				return;
			}
		}
		this.setAccountBalance(currentAmount - amount);
	
	}
	
}
