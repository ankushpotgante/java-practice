package packArray;

//import java.util.Scanner;

public class TwentySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mat1[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int mat2[][] = new int[][] { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

		int product[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				product[i][j] = mat1[i][0] * mat2[0][j] + mat1[i][1] * mat2[1][j] + mat1[i][2] * mat2[2][j];
				System.out.print(product[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
