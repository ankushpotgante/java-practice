import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any three digit number: ");
		
		int num = sc.nextInt();
		
		int rev = 0, temp = 0;
		
		while(num > 0) {
			temp = num % 10;
			num /= 10;
			rev = rev * 10 + temp;
		}
		
		System.out.println("Reverse is: "+rev);
		
		sc.close();
	}
}
