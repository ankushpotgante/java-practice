import java.util.Scanner;

public class ProductByRecursiveSum {

	static int product(int a, int b) {
		if (b == 0)
			return 0;

		if (b > 0)
			return (a + product(a, (b - 1)));

		if (b < 0)
			return -product(a, -b);

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any two numbers: ");

		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = product(a, b);

		System.out.println("Multiplication of " + a + " and " + b + " is " + c);

		sc.close();
	}

}
