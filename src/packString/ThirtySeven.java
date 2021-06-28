package packString;

public class ThirtySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "This is java book.";
		
		StringBuilder sb = new StringBuilder(s1);
		
		sb.delete(4, 8);
		
		sb.delete(4,8);
		
		s1 = sb.toString();
		
		System.out.println(s1);
	}

}
