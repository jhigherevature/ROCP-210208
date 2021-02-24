package operators;

public class Example {
	
	/* limits to naming variables & parameters:
	 * 1 - cannot name them with a reserved word
	 * 	if, class, else, new, static
	 * 2 - they cannot start with numbers
	 */
	public static void main(String[] args) {
		Example ex = new Example();
		ex.doSomething();
		System.out.println(5+5);
		// to invoke a method, state its name
		// after the object using a dot, with
		// parenthesis afterwards... ex.method()
		System.out.println(ex.giveTen());
		System.out.println(ex.giveWord());
		
		// 10 and 20 are the arguments passed to
		// the method 'add'
		ex.add(10, 20);
	}
	
	public void doSomething() {
		System.out.println("Hey, I did something!");
	}
	
	public int giveTen() {
		return 10;
	}
	
	// you must match the return type specified
	public String giveWord() {
//		return 100; // error!
		String word = new String("Hello");
		System.out.println(word);
		return "100";
	}
	
	// int a and int b are the parameters for the
	// 'add' method.
	public void add(int a, int b) {
		System.out.println(a + b);
	}

}
