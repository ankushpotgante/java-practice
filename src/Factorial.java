import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter any integer: ");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		long factorial = fact(num);

		System.out.println("Factorial of " + num + " is " + factorial);

		sc.close();

	}

	public static long fact(int num) {
		if (num == 1)
			return 1;

		return num * fact(num - 1);
	}

}
