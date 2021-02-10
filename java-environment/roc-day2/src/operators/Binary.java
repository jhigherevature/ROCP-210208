package operators;

public class Binary {
	public static void main(String[] args) {
		double a = 5;
		double b = 2;
		int x = 5;
		int y = 2;
		System.out.println("Multiplication:");
		System.out.println("doubles:" + a * b); // 10.0
		System.out.println("int:" + x * y); // 10
		
		System.out.println("Division");
		System.out.println("doubles: " + a / b);
		System.out.println("int: " + x / y);
		
		// when converting datatype, remember that values
		// are truncated! no rounding!
		double decimal = 9.99999;
		int num = (int)decimal;
		System.out.println(num);
		
		/*
		 * Any number modulus 2 will either be 0 or 1
		 * an easy way to find even/odd numbers
		 */
		System.out.println("Modulus");
		System.out.println("doubles: " + a % b);
		System.out.println("int: " + x % y);
		
		String word = "Revature";
		System.out.println("Addition");
		System.out.println("doubles: " + a + b);
		System.out.println("int: " + x + y);
		System.out.println("concat: " + word + a);
		
		Data one = new Data();
		Data two = new Data();
		Data three = one;
		
		// The '==' checks that memory addresses are
		// the same. Every object has its own space
		// in memory
		System.out.println(one.val == two.val); // true
		System.out.println(one == two); // false
		System.out.println(one == three); // true
	}
}
