import java.util.Scanner;

public class ChooseMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number between 1-12: ");
		
		int month = 0;
		
		month = sc.nextInt();
		
		switch (month) {
			case 1:
				System.out.println("January 31 days");
				break;
			case 2:
				System.out.println("Feburary 28/29 days");
				break;
			case 3:
				System.out.println("March 31 days");
				break;
			case 4:
				System.out.println("April 30 days");
				break;
			case 5:
				System.out.println("May 31 days");
				break;
			case 6:
				System.out.println("June 30 days");
				break;
			case 7:
				System.out.println("July 31 days");
				break;
			case 8:
				System.out.println("August 31 days");
				break;
			case 9:
				System.out.println("September 30 days");
				break;
			case 10:
				System.out.println("October 31 days");
				break;
			case 11:
				System.out.println("November 30 days");
				break;
			case 12:
				System.out.println("December 31 days");
				break;
			default:
				System.out.println("Enter valid month number!");
		}
		
		sc.close();
	}

}
