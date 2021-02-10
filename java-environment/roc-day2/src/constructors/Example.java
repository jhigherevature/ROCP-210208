package constructors;

public class Example {
	String name;
	int id;
	// custom constructors can have custom logic!
	public Example(String name, int id) {
		super();
		System.out.println("Heres my constructor!");
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.id;
	}
}
