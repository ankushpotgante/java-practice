import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter year to check: ");

		int year = sc.nextInt();

		if (isLeapYear(year)) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not leap year.");
		}

		sc.close();
	}

	public static boolean isLeapYear(int year) {
		if (year % 400 == 0) 
			return true;

		if (year % 100 == 0)
			return false;

		if (year % 4 == 0)
			return true;

		return false;
	}

}
