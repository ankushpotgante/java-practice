
public class PatternTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 6; i++) {
			for(int j = 1;j <= 6-i; j++) {
				if(j == 5/2) {
					System.out.print(j);
				}else {
					System.out.print(j+" ");
				}
			}
			System.out.println("");
		}

	}

}
