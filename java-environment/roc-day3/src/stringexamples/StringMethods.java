package stringexamples;

public class StringMethods {
	public static void main(String[] args) {
		// Strings are an Array of chars
		// char[]
		String words = "Hello12413World!9my1Name Is Joseph";
		String one = "Hello";		
		String two = "HeLlO";
		String three = new String("Hello");
		System.out.println(words.charAt(3));
		System.out.println(words.indexOf('l', 5));
		
		System.out.println(words.substring(7, 10));
		System.out.println(one.equals(two));
		System.out.println(one.equalsIgnoreCase(two));
		System.out.println(two.toLowerCase());
		System.out.println(two);
		two = two.toLowerCase(); // to change the casing, we must
								// reassign the value
		
		System.out.println(one == three); // false
		three = three.intern();
		System.out.println(one == three);
		
		System.out.println("Split a String into an array:");
		String crazyWord = "HelloREVATUREWorldREVATUREProgramming";
		String[] split = crazyWord.split("\s");
		for (String s : split) {
			System.out.println(s);
		}
		
		String twenty = new String("20");
		String twenty_String = "20";
		System.out.println(twenty == twenty_String); // false
		twenty = twenty.intern();
		System.out.println(twenty == twenty_String); // true
	}
}
