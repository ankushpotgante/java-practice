package packString;

import java.util.Scanner;

public class ThirtyThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter string: ");

		String s1 = sc.nextLine();

		System.out.println("\nfifth character: " + s1.charAt(4) + "\ntenth character: " + s1.charAt(9)
				+ "\nfiftenth character: " + s1.charAt(14) + "\ntwentieth character: " + s1.charAt(19)
				+ "\ntewnty fifth character: " + s1.charAt(24));
		
		sc.close();

	}

}
