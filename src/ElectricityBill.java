import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String customerName;
		long meterNumber;
		double previousReading, currentReading;

		System.out.print("Enter customer name: ");
		customerName = sc.nextLine();
		
		System.out.print("Enter meter number: ");
		meterNumber = sc.nextLong();
		
		System.out.print("Enter previous reading: ");
		previousReading = sc.nextDouble();
		
		System.out.print("Enter current reading: ");
		currentReading = sc.nextDouble();

		double totalReading = currentReading - previousReading;

		double amount;

		if (totalReading < 50) {
			amount = 0.60 * totalReading;
		} else if (totalReading >= 50 && totalReading < 200) {
			amount = 1.00 * totalReading;
		} else if (totalReading >= 200 && totalReading < 500) {
			amount = 1.50 * totalReading;
		} else {
			amount = 1.80 * totalReading;
		}

		double tax = 0.03 * amount;

		double bill = tax + amount;

		System.out.println("Meter no.:  " + meterNumber + "\nCustomer Name: " + customerName + "\nBill: " + bill);

		sc.close();
	}

}
