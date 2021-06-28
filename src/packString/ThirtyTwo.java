package packString;

public class ThirtyTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Java was developed by Sun Microsystems (which is now the subsidiary of Oracle) in the year 1995. "
				+ "James Gosling is known as the father of Java. Before Java, its name was Oak. Since Oak was already a registered company,"
				+ " so James Gosling and his team changed the Oak name to Java.";
		
		String [] arr = s1.split(" ");
		
		System.out.println("Paragraph splitted by space.");
		System.out.println("First Element: "+arr[0]);
		System.out.println("Sixth Element: "+arr[5]);
		System.out.println("Last Element: "+arr[arr.length - 1]);

	}

}
