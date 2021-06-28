import java.util.Scanner;

public class ProfitOrLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter purchase cost: ");

		double purchaseCost = sc.nextDouble();

		System.out.print("Enter sale cost: ");

		double saleCost = sc.nextDouble();

		if (purchaseCost > saleCost) {
			System.out.println("There is loss of: " + Math.abs(purchaseCost - saleCost));
		}

		if (saleCost > purchaseCost) {
			System.out.println("There is profit of: " + (saleCost - purchaseCost));
		}

		if (saleCost == purchaseCost) {
			System.out.println("There is no profit or loss happened!");
		}

		sc.close();

	}

}
