package packString;

import java.util.Scanner;

public class ThirtyFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		
		String full_name = sc.nextLine().concat(" ");
		
		System.out.print("Enter middle name: ");
		
		full_name = full_name.concat(sc.nextLine()).concat(" ");
		
		System.out.print("Enter last name: ");
		
		full_name = full_name.concat(sc.nextLine());
		
		System.out.println("Full name is: "+full_name);
		
		sc.close();
	}

}
