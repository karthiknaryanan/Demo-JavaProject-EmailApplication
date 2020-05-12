package bankAccountApp;

public abstract class Account implements IBaserate {
// list common properties for savings and checking accounts
	String name;
	String sSN;
	String accountNumber;
	double balance;
	double rate;
	static int index = 10000;

	public Account(String name, String ssn, double initDeposit) {
		this.name = name;
		this.sSN = ssn;
		balance = initDeposit;
		// System.out.println("Name: " + name+" "+"SSN: "+ssn+" "+"Balance: $"+balance);
		index++;
		this.accountNumber = setAccountNumber();
		// System.out.print("Account Type: ");

		setRate();

	}

	public abstract void setRate();
	
	public void deposit(double amount) {
		balance = balance+amount;
		System.out.println("Depositing $"+amount);
		printBalance() ;
	}
	
	public void withdraw(double amount) {
		balance = balance-amount;
		System.out.println("Withdrawing $"+amount);printBalance() ;
	}
	public void transfer(String toWhere,double amount) {
		balance = balance-amount;
		System.out.println("Transferring $"+amount);
		printBalance() ;
	}
	public void printBalance() {
		System.out.println("Your balance now is: $"+balance);
	}
	
	
	

	private String setAccountNumber() {
		String lastTwoOfSsn = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueId = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSsn + uniqueId + randomNumber;
	}

	public void showInfo() {
		System.out.println("DISPLAYING USER INFORMATION:" + "\nNAME: " + name + "\nACCOUNT NUMBER: " + accountNumber
				+ "\nBALANCE: $" + balance + "\nRATE : " + rate + "%");

	}
}
