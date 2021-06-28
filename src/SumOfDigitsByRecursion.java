import java.util.Scanner;

public class SumOfDigitsByRecursion {

	public static int recDigitSum(int num) {
		if (num <= 0) {
			return num;
		}
		return ((num % 10) + recDigitSum(num / 10));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter any number: ");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int sum = recDigitSum(num);

		System.out.println("Sum of Digits of " + num + " is " + sum);

		sc.close();

	}

}
