import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter any three digit number: ");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num == reverse(num)) {
			System.out.println("This number is palindrome!");
		} else {
			System.out.println("This number is not palindrome!");
		}
		
		sc.close();

	}
	
	public static int reverse(int num) {
		int temp,reverse=0;
		
		while (num > 0) {
			temp = num % 10;
			num = num / 10;
			reverse = reverse * 10 + temp;
		}
		
		return reverse;
	}

}
