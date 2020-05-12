package emailApp;

import java.util.Scanner;

public class StudentDatabase {

	public static void main(String[] args) {

		System.out.println("Enter the number of New Students: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		for (int i = 0; i < numOfStudents; i++) {

			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println("*************");

		}

	}

//	Ask the user how many new students will be added to the database 
//	The user should be prompted to enter the name and year for each student
//	 The student should have a 5-digit unique ID, with the first number being their grade level 
	// A student can enroll in the following courses: History 101 Mathematics 101
	// English 101 Chemistry 101 Computer Science 101
	// Each course costs $600 to enroll
	// The student should be able to view their balance and pay the tuition
	// To see the status of the student, we should see their name, ID, courses
	// enrolled, and balance
}
