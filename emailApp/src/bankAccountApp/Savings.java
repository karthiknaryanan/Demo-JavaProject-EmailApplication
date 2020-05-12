package bankAccountApp;

public class Savings extends Account {
	// list specific properties related to Savings accounts
	int safetyDepositBoxId;
	int safetyDepositBoxKey;

	public Savings(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		// System.out.println("SAVING ACCOUNT");
		accountNumber = "1" + accountNumber;
		// System.out.println("Account Number: "+this.accountNumber);
		setSafetyDepositBox();
	}

	@Override
	public void setRate() {
		rate = getBaseRate() - .25;

	}

	private void setSafetyDepositBox() {
		safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}

	public void showInfo() {
		super.showInfo();
		// System.out.println("ACCOUNT TYPE: SAVINGS");
		System.out.println(" Your Savings Account Features!!!" + "\n SAFETY DEPOSIT BOX ID: " + safetyDepositBoxId
				+ "\n SAFETY DEPOSIT BOX KEY: " + safetyDepositBoxKey);

	}
}
