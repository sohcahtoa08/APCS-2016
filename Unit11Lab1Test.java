/**
 * This program tests the methods and objects associated with the
 * Account, SavingsAccount, and CheckingAccount classes.
 * 
 * @author Pranshu Suri
*/

public class Test {

	public static void main(String[] args) {
		
		// Create savings and checking account objects
		Account mySavingsAccount = new SavingsAccount(1, 1000.00, 5,
				new Date(3, 28, 17));
		Account myCheckingAccount = new CheckingAccount(2, 750.00, 10,
				new Date(8, 22, 16), 100);
		
		mySavingsAccount.withdraw(500);
		System.out.println("Savings Account Balance: $" + 
				mySavingsAccount.getAccountBalance());
		// Account balance should be 500
		
		mySavingsAccount.withdraw(600);
		System.out.println("Savings Account Balance: $" + 
				mySavingsAccount.getAccountBalance());
		/* Account balance should still be 500 because you
		   cannot overdraw from savings accounts */
		
		mySavingsAccount.deposit(600);
		System.out.println("Savings Account Balance: $" + 
				mySavingsAccount.getAccountBalance());
		// Account balance should be 1100
		
		mySavingsAccount.deposit(400);
		System.out.println("Savings Account Balance: $" + 
				mySavingsAccount.getAccountBalance());
		// Account balance should be 1500
		
		
		System.out.println();
		
		
		myCheckingAccount.withdraw(600);
		System.out.println("Checking Account Balance: $" + 
				myCheckingAccount.getAccountBalance());
		// Account balance should be 150
		
		myCheckingAccount.withdraw(200);
		System.out.println("Checking Account Balance: $" + 
				myCheckingAccount.getAccountBalance());
		// Account balance should be -50
		
		myCheckingAccount.withdraw(100);
		System.out.println("Checking Account Balance: $" + 
				myCheckingAccount.getAccountBalance());
		/* Account balance should still be -50 because it cannot
		   exceed the overdraft limit (100) */
		
		myCheckingAccount.deposit(100);
		System.out.println("Checking Account Balance: $" + 
				myCheckingAccount.getAccountBalance());
		// Account balance should be 50
		
		myCheckingAccount.deposit(700);
		System.out.println("Checking Account Balance: $" + 
				myCheckingAccount.getAccountBalance());
		// Account balance should be 750
		
	}

}
