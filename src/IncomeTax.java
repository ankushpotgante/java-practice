import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter basic salary: ");

		double basicSalary = sc.nextDouble();

		double incomeTax;

		if (basicSalary < 5000) {
			incomeTax = 0;
		} else if (basicSalary >= 5000 && basicSalary < 7000) {
			incomeTax = 0.03 * basicSalary;
		} else if (basicSalary >= 7000 && basicSalary < 10000) {
			incomeTax = 0.04 * basicSalary;
		} else {
			incomeTax = 0.05 * basicSalary;
		}

		System.out.println("Income Tax for " + basicSalary + " is " + incomeTax);

		sc.close();

	}

}
