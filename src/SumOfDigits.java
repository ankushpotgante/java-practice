import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any int: ");
		
		int num = sc.nextInt();
		
		int sum = 0;
		
		while (num>0) {
			sum = sum + (num%10);
			num /= 10;
		}
		
		System.out.println("Sum of its digits is: "+sum);
		
		sc.close();
	}

}
