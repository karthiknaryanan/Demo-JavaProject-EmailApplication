package emailApplication;

import java.util.Scanner;

public class AverageNNumbers {
	private double sum;
	private int n;

	public double getAverage() {
		return sum / n;
	}

	public double getSum() {
		return sum;
	}

	public double getN() {
		return n;
	}

	public void start() {
		sum = 0;
		System.out.println("How many numbers?");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("?");
			int add = in.nextInt();
			sum = sum + add;
		}

		System.out.println("The average of " + n + " numbers is: " + getAverage());
		in = null;
	}

}
