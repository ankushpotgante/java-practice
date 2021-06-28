package packArray;

//import java.util.Scanner;

public class TwentyFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mat[][] = new int[][] {{1,2,3,0},{4,5,6,0},{7,8,9,0}};
		
		// we can input this number as well
		// int mat_len = 3;
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
