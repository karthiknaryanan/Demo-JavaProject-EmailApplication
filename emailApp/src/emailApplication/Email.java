package emailApplication;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int mailBoxCapacity = 500;
	private String email;
	private String alternateEmail;
	private String companyName = "google";
	private String department;

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		// Ask for the department code
		this.department = setDepartment();
		//System.out.println("Your Department is: " + this.department);

		// Generate email with the syntax: "firstname.lastname@department.company.com"
		this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + "."
				+ this.companyName + ".com";
	//	System.out.println("Your Email id is: " + email);

		// Display the random password
		this.password = generatePassword(8);
		System.out.println("Your Temperory Password is: " + this.password);

	}

	// SetMethod for the department code

	private String setDepartment() {
		System.out.println("New Worker: " + this.firstName + " " + ";" + " Enter your Department Code!"
				+ "\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None");
		Scanner in = new Scanner(System.in);
		int departmentCode = in.nextInt();
		switch (departmentCode) {
		case 1:
			return "sales";
		case 2:
			return "dev";
		case 3:
			return "accounts";
		default:
			return "";

		}

	}

	// Generate a random password

	private String generatePassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@£$";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);

		}

		return new String(password);
	}

	// set methods to change password, mailBox capacity, alternate email

	public void changePassword(String password) {
		this.password = password;
	}

	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	// Get methods to display the name, email, and mailbox capacity

	public String showInformation() {

		return "DISPLAYING INFORMATION!!!\nNAME: " + this.firstName + " " + this.lastName + "\nEMAIL: " + this.email
				+ "\nMAILBOX CAPACITY: " + this.mailBoxCapacity + "mb";

	}

}
