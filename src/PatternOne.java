import java.util.Scanner;

public class PatternOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("enter number of layers: ");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; ++j)
				System.out.print("* ");
			System.out.println("");
		}

		sc.close();
	}

}
