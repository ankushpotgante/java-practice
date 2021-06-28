import java.util.Scanner;

public class PrimeCheck {

	static boolean isPrime(int num) {

		if (num <= 1)
			return false;

		if (num <= 3)
			return true;

		if (num % 2 == 0 || num % 3 == 0)
			return false;

		int i = 5;

		while (num > i * i) {
			if (num % i == 0 || num % (i + 2) == 0)
				return false;
			i = i + 6;
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any integer: ");

		int num = sc.nextInt();

		boolean prime = isPrime(num);

		if (prime)
			System.out.println(num + " is prime number");
		else
			System.out.println(num + " is not prime number");

		sc.close();

	}

}
