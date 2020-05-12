package emailApplication;

import java.util.Scanner;

public class EncryptString {
	// Declare Required member variables
	private String originalString;
	private String encryptedString;

	// Define Getter methods to get the value of member values
	public String getOriginalString() {
		return originalString;
	}

	public String getEncryptedString() {
		return encryptedString;
	}

	// Create a method to encrypt the original String
	public void encryptString() {

		getInput();
		
		/*
		 * for(int i=0; i<originalString.length()-1;i++) {
		 * encryptedString+=Character.toString((char)(originalString.charAt(i)-1)); }
		 */
		
		System.out.println("\n");
		for(int i=0; i<originalString.length();i++) {
			
			String eachCharacter = Character.toString((char)originalString.charAt(i));
			int eachCharacterValue =(int) originalString.charAt(i);
		
			System.out.println(eachCharacter+" "+eachCharacterValue);			
		}
		
	}

	public void getInput() {
		// Prompt the user to enter the input:
		System.out.println("Enter the String you want to encrypt:\n");

		// Use Scanner class to read the console and Store it as originalString:
		Scanner in = new Scanner(System.in);
		originalString = in.nextLine();
		
		in = null;
	}

}
