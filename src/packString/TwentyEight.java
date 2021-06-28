package packString;

//import java.util.Scanner;

public class TwentyEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "This is new model degree college, Hingoli.";
		String str2 = "Java is best programming language.";

		char a1 = str1.charAt(0);
		char a2 = str2.charAt(0);

		char b1 = str1.charAt(str1.length() - 2);
		char b2 = str2.charAt(str2.length() - 2);

		if (a1 == a2 && b1 == b2) {
			if (a1 == 'J' && b1 == 'e')
				System.out.println("Both strings start with 'J' and ends with 'e'.");
			else
				System.out.println(
						"Both strings start and ends with same character but not start with 'J' and ends with 'e'.");
		} else
			System.out.println("Both strings does not start and ends with same character.");

	}

}
