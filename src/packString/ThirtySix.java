package packString;

public class ThirtySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "This is java book.";
		
		StringBuilder sb = new StringBuilder(s1);
		
		sb.insert(4,"best");
		
		sb.insert(4, 500);
		
		s1 = sb.toString();
		
		System.out.println(s1);
		

	}

}
