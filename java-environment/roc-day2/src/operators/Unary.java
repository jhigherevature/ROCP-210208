package operators;

public class Unary {

	public static void main(String[] args) {
		int i = 10;
		// pre increment increases before returning
		System.out.println(++i); // 11
		
		// post increment increase after returning
		System.out.println(i++); // 11
		
		System.out.println(i); // 12 
		
		System.out.println(!false); // true
		System.out.println(!true); // false
	}

}
