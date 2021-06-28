package packString;

import java.util.Scanner;

public class ThirtyEight {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any string: ");
		
		String s = sc.nextLine();
		
		String rev = "";
		
		for(int i = 0; i < s.length(); i++) {
			rev = rev + s.charAt(s.length() -1 -i);
		}
		
		
		if(s.equals(rev))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
		
		sc.close();
		
	}

}
