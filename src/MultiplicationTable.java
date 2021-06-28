import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter number to print table: ");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(i * num);
		}

		sc.close();
	}

}
