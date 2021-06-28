package packString;

import java.util.Scanner;

public class ThirtyFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		
		String s1 = sc.nextLine();
		
		System.out.print("Enter second string: ");
		
		String s2 = sc.nextLine();
		
		boolean present = false;
		
		for(int i = 0; i < s1.length(); i++) {
			boolean found = false;
			
			if(s1.charAt(i)==s1.charAt(0)) {
				found = true;
				for(int j = 0; j < s2.length(); j++) {
					if(s1.charAt(i+j) != s2.charAt(j)) {
						found = false;
						break;
					}
				}
			}
			
			if(found) {
				present = true;
				//System.out.println("Found at: "+i);
				}
		}
		
		if(present)
			System.out.println("Second string is present in first string!");
		else
			System.out.println("Not present!");
		
		sc.close();

	}

}
