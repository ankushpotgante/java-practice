import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number: ");

		int num = sc.nextInt();

		int a = 0, b = 1, c;

		System.out.print(a+" "+b+" ");
		//System.out.println(b);

		for (int i = 0; i < num - 2; i++) {
			c = a + b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}

		sc.close();
	}

}
