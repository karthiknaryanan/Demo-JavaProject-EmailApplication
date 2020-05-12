package bankAccountApp;

import java.util.Scanner;

public class Tryouts {
	public static void main(String[] args) {
		/*
		 * String name = "Alexandra Abramov"; System.out.println("Hello");
		 * System.out.println(name);
		 */

		/*
		 * Scanner in = new Scanner(System.in);
		 * System.out.println("Enter the first Number: "); int inputNumber1 =
		 * in.nextInt(); System.out.println("Enter the Second Number:"); int
		 * inputNumber2 = in.nextInt();
		 * 
		 * int product = inputNumber1*inputNumber2; System.out.println(product);
		 */

		/*
		 * Scanner in = new Scanner(System.in);
		 * System.out.println("Enter the  Number: "); int inputNumber = in.nextInt();
		 * 
		 * for(int i=1; i<=10;i++) { System.out.println(inputNumber + "*"+ i+" = "+
		 * inputNumber*i); }
		 */
		/*
		 * int row =5; int column=5; for(int count=1; count<=row; count++) { for(int
		 * counted=1; counted<=count;counted++) { System.out.print("*"); }
		 * System.out.println(); } for(int count=row-1; count>=1; count--) { for(int
		 * counted=1; counted<=count;counted++) { System.out.print("*"); }
		 * System.out.println(); }
		 */

		/*
		 * String string = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		 * 
		 * char[] char_arr = string.toCharArray(); int letter = 0; int space = 0; int
		 * number = 0; int others = 0; for (int i = 0; i < char_arr.length; i++) { if
		 * (Character.isDigit(char_arr[i])) { number++; } else if
		 * (Character.isLetter(char_arr[i])) { letter++; } else if
		 * (Character.isSpaceChar(char_arr[i])) { space++; } else { others++; } }
		 * System.out.println(letter); System.out.println(space);
		 * System.out.println(number); System.out.println(others);
		 */

	

		// System.out.println(Arrays.toString(charNumArrayimport java.util.Scanner;

		/*
		 * int amount = 0; for (int i = 1; i <= 4; i++) { for (int j = 1; j <= 4; j++) {
		 * for (int k = 1; k <= 4; k++) { if (k != i && k != j && i != j) { amount++;
		 * System.out.println(i + "" + j + "" + k); } } } }
		 * System.out.println("Total number of the three-digit-number is " + amount);
		 */
		/*
		 * Scanner in = new Scanner(System.in); System.out.println("Enter String\n");
		 * String nextLine = in.nextLine(); System.out.println(nextLine);
		 */
		
		Scanner in = new Scanner(System.in);
		int nextInt = in.nextInt();
		int nextInt2 = in.nextInt();
		int nextInt3 = in.nextInt();
		System.out.println(nextInt);System.out.println(nextInt2);System.out.println(nextInt3);
	}
}
