package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 10;
	private String department;
	private String alternateEmail;
	private int mailBoxCapacity = 500;
	private String email;
	private String companyName = ".company.com";

	// Constructor to receive the first Name and the last Name;
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		// call a method asking for the department + return the department
		this.department = setDepartment();
		//System.out.println("Department is: " + this.department);
		// call a method that returns a random password
		this.password = generatePassword(defaultPasswordLength);
		System.out.println("Your Password is: " + this.password);
		// combine elements to generate Email

		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companyName;
		//System.out.println("Your Email is: " + email);

	}

	// Ask for the department
	private String setDepartment() {
		System.out.println("New Worker:"+ firstName+
				"; Department Codes:\n 1 for Sales\n 2 for Development\n 3 for Account\n 0 for None\n Enter the Department Code");
		Scanner in = new Scanner(System.in);
		int departmentChoice = in.nextInt();
		if (departmentChoice == 1) {
			return "sales";
		} else if (departmentChoice == 2) {
			return "dev";
		} else if (departmentChoice == 3) {
			return "acc";
		} else
			return "";
	}
	// Generate a random Password

	private String generatePassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_!@";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}

		return new String(password);
	}

	// Set the mailBox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}

	// set the alternate Email Id
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;

	}

	// Change the password
	public void changePassword(String password) {
		this.password = password;

	}

	// Getter Methods
	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}

	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}

	public String showInfo() {
		return "DISPLAY NAME: " + firstName+ " "+ lastName+ "\nCOMPANY EMAIL: "+ email 
				+ "\nMAILBOX CAPACITY: "+ mailBoxCapacity+"mb"; 
	}
	
	
}
