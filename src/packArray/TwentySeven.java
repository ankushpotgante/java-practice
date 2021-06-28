package packArray;

public class TwentySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mat[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i = 0;i< mat.length;i++) {
			for(int j = 0; j<mat[i].length;j++) {
				if(i==j)
					mat[i][j] = 0;
				System.out.print(mat[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
