package stringexamples;

public class StringSimulator {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(s1);
		System.out.println(s2);
		String s3 = new String("Hello");
		s3 = s3 + "s";
		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
	}

}
