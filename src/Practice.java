import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double p;
		int q;
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter product name: ");
		
		name = sc.nextLine();
		
		System.out.print("Enter Price: ");
		
		p = sc.nextDouble();
		
		System.out.print("Enter Quantity: ");
		
		q = sc.nextInt();
		
		double totalAmount = p*q;
		
		double disc = 0.2 * totalAmount;
		
		double bill = totalAmount - disc;
		
		System.out.println("Total Amount for item " +name+" is: "+totalAmount+"\nDiscount is: "+disc+"\nBill is: "+bill);
		
		sc.close();
		
		
	}

}
