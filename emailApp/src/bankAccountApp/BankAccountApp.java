package bankAccountApp;

public class BankAccountApp {

	public static void main(String[] args) {

		Checking checkAccount1 = new Checking("Karthik Johnson", "123456789", 5000);
		Savings savingAccount1 = new Savings("Dwayne Bravo", "789456123", 1000);
		checkAccount1.showInfo();
		checkAccount1.deposit(5000);
		checkAccount1.withdraw(200);
		checkAccount1.transfer("GOD", 3000);
		System.out.println("***********************************");
		savingAccount1.showInfo();
		
		
	}

}
