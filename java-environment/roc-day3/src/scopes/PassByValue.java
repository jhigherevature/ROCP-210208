package scopes;

public class PassByValue {
	
	public static void main(String[] args) {
		int i = 15;
		Example ex = new Example();
		ex.name = "Joseph";
		System.out.println(printPrimitive(i));
		System.out.println(i); // 15, i was not changed
		System.out.println("ex:" + ex.name); // Joseph
		
		Example ex_2 = ex;
		ex.name = "Sally";
		System.out.println(ex_2.name);
		
		manipulateObject(ex);
		System.out.println("ex:" + ex.name); // Steve
	}
	
	public static int printPrimitive(int input) {
		input = 50;
		return input;
	}
	
	// passing reference variables to a method, provide the memory 
	// address. This means we can manipulate objects in memory
	// and that can effect objects we create outside of a method.
	public static void manipulateObject(Example example) {
		example.name = "Steve";
//		Example temp = new Example();
//		temp.name = example.name;
//		temp.name = "Steve";
		System.out.println(example.name);
//		System.out.println(temp.name);
	}
}
