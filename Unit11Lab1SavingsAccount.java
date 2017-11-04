/**
 * This class simulates the members and methods associated with a
 * SavingsAccount object.
 * 
 * @author Pranshu Suri
*/

public class SavingsAccount extends Account {
	
	// constructor: no arguments
	public SavingsAccount() {
		
		super();
		
	}
	
	/* constructor: 4 arguments -> account number, account balance, interest rate,
	   date created */
	public SavingsAccount(int accountNum, double accountBal, double interest,
			Date date) {
		
		super(accountNum, accountBal, interest, date);
		
	}
	
	// deposit method
	public void deposit(double amount) {
		
		double currentAmount = this.getAccountBalance();
		this.setAccountBalance((currentAmount + amount));
	
	}
	
	// withdraw method
	public void withdraw(double amount) {
		
		double currentAmount = this.getAccountBalance();
		/* don't withdraw if, after withdrawal, the account balance is less
		   than 0 */
		if (currentAmount - amount < 0) {
			return;
		}
		this.setAccountBalance(currentAmount - amount);
	
	}
	
}
