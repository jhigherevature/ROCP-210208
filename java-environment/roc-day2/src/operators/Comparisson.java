package operators;

public class Comparisson {
	public static void main(String[] args) {
		System.out.println("AND Operator:");
		System.out.println(true & true); // true
		System.out.println(true & false); // false
		System.out.println(false & true); // false
		System.out.println(false & false); // false
		
		System.out.println("OR Operator:");
		System.out.println(true | true); // true
		System.out.println(true | false); // true
		System.out.println(false | true); // true
		System.out.println(false | false); // false
		
		System.out.println("Working with numbers:");
		int a = 15;
		int b = 25;
		int c = 9;
		int d = 1123;
		System.out.println(a > b & c < d); // false
		System.out.println((a > b) & (c < d)); // false
		System.out.println(a < b & c < d); // true
		
		// use parenthesis when you want to resolve
		// in an order that is contrary to the normal
		// execution order of operations
		System.out.println(4 + 5 * 3); // multiplication first
		System.out.println((4 + 5) * 3); // addition first
		
		int one = 1;
		// return the value of 'one'
		// multiply the value by 5
		// increase the value of 'one' by 1 
		System.out.println("Before any operations one is: " + one + " Post Unary: " + (one++ * 5) + " value of one: " + one); // 5
		System.out.println(one * 100); // 200
		
		one = 1;
		System.out.println(++one * 5); // 10
		System.out.println(one); // 2
		
	}
}
