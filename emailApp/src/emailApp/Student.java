package emailApp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private int courseCost = 600;
	private int tutionBalance;
	private String courses = "";
	private static int id = 1000;

	public Student() {
		// System.out.println("Enter the number of New Students!! ");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Student first name: ");
		this.firstName = in.nextLine();
		System.out.println("Enter the Student last name: ");
		this.lastName = in.nextLine();
		System.out.println(
				"1 for Freshmen\n2 for Sophmore" + "\n3 for Junior\n4 for Senior\nEnter the Student grade year: ");
		this.gradeYear = in.nextInt();
		System.out.println(this.firstName + " " + this.lastName + " " + this.gradeYear);

		setStudentId();

		//System.out.println("your id is: " + studentId);

	}

	private void setStudentId() {
		this.studentId = this.gradeYear + "" + id;
		id++;
	}

	public void enroll() {
		do {
			System.out.print("Enter course to enroll(Q to quit)");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n " + course;
				tutionBalance = tutionBalance + courseCost;
			} else {
				break;
			}
		} while (1 != 0);
		System.out.println("Enrolled in: " + courses);
		// System.out.println("Tuition Balance: " + tutionBalance);

	}

	public void viewBalance() {
		System.out.println("Your balance is: $" + tutionBalance);
	}

	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tutionBalance = tutionBalance - payment;
		System.out.println("Thanks for your payment: $" + payment);
		viewBalance();
	}

	public String showInfo() {

		return "Displaying Student Information!!!\nNAME: "+this.firstName+" "+this.lastName+
				"\nID: "+studentId+"\nCourses Enrolled in: "+courses+"\nTuitionBalance: "+tutionBalance;

	}

}
