package constructors;

public class ThisConstructor {
	String name;
	int id;
	
	public ThisConstructor() {
		//super(); // error, only one other constructor can
					// be called in each constructor
		this("No Name", 0);
	}
	
	public ThisConstructor(String name) {
		this(name, 0);
	}
	
	public ThisConstructor(int id) {
		this("No Name", id);
	}
	
	public ThisConstructor(String name, int id) {
		super();
		System.out.println("Constructor with parameters");
		this.name = name;
		this.id = id;
		this.printStatements();
	}
	
	public void printStatements() {
		System.out.println("Our Object has:");
		System.out.println("Name: " + this.name);
		System.out.println("Id: " + this.id);
	}
}
