package packArray;

import java.util.Scanner;

public class TwentyTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;

		int arr[] = new int[10];

		System.out.println("We have following array of length " + arr.length + ": ");

		for (i = 0; i < arr.length; i++) {
			arr[i] = i + 3 * i + 5 * i + 12 * i + 10;
			System.out.print(arr[i] + " ");
		}


		// suppose till here we have predefined code

		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n-------------------------------------------");

		System.out.print("Enter length of array: ");

		int l = sc.nextInt();

		System.out.print("Enter element to find: ");

		int num = sc.nextInt();

		sc.close();

		boolean found = false;

		for (i = 0; i < l; i++) {
			if (arr[i] == num) {
				found = true;
				break;
			}
		}

		if (found)
			System.out.println(arr[i] + " found at position " + i);
		else
			System.out.println("Element not found in array");
	}

}
