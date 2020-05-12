package bankAccountApp;

public class Checking extends Account {
	// list specific properties related to checking accounts
	int debitCardNumber;
	int debitCardPin;

	public Checking(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		// System.out.println("Current Account ");
		accountNumber = "2" + accountNumber;
		// System.out.println("Account Number: "+this.accountNumber);
		setDebitCard();
	}

	@Override
	public void setRate() {
		rate = getBaseRate() * .15;

	}

	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}

	public void showInfo() {
		super.showInfo();
		// System.out.println("ACCOUNT TYPE: CHECKING");
		System.out.println(" Your Checking Account Features!!!" + "\n DEBITCARD NUMBER: " + debitCardNumber
				+ "\n DEBITCARD PIN: " + debitCardPin);

	}

}
