import java.util.Scanner;


public class LastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any integer: ");
		
		int num = sc.nextInt();
		
		int lastDigit = num % 10;
		
		System.out.println("Last Digit of "+num+" is "+lastDigit);
		
		sc.close();
	}

}
