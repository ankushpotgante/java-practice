import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;

		double bs;

		System.out.print("Enter Your name: ");

		Scanner sc = new Scanner(System.in);

		name = sc.nextLine();

		System.out.print("Enter your basic salary: ");

		bs = sc.nextDouble();

		double da = 0.13 * bs;

		double ta = 0.04 * bs;

		double hra = 0.07 * bs;

		double ts = bs + da + ta + hra;

		double it = 0.03 * bs;

		double ms = ts - it;

		System.out.println("Name: " + name + "\nBasic Salary: " + bs + "\nDA: " + da + "\nTA: " + ta + "\nHRA: " + (int) hra
				+ "\nTotal Salary: " + ts + "\nIncome Tax: " + it + "\nMS: " + ms);
		sc.close();

	}

}
