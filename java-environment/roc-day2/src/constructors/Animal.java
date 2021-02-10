package constructors;

public class Animal {
	String name;
	String type;
	int age;
	
	public Animal(String name) {
		super();
		System.out.println("This is the animal constructor that sets the name");
		this.name = name;
	}
	
	public Animal(String name, String type) {
		System.out.println("This is the animal constructor that sets the name and type");
		this.name = name;
		this.type = type;
	}
	
	public Animal(String name, String type, int age) {
		System.out.println("This is the animal constructor that sets the name, type and age");
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	// We can switch order, type and amount of parameters
	// to distinguish between methods/constructors when
	// using method overloading
	public Animal (int age, String name, String type) {}
	
	
	public int add(int a, int b) { return a + b; }
	// error below because we cannot determine which method
	// to use by the return type alone!
//	public double add(int a, int b) {return a + b; } 
	public int add(int a, int b, int c) { return a + b + c; }
		
	public double add(int a, int b, int c, int d) { 
		return a + b + c + d;
	}
	
	public int add(double a, double b, double c, double d, double e) {
		return (int)(a + b + c + d + e);
	}
}
