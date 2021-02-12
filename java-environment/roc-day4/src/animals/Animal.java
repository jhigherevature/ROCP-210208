package animals;

public abstract class Animal {
	String name;
	String type;
	int age;
	
	public Animal(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	public String toString() {
		return "Animal Name: " + name + ", Animal type: " + type + ", Age: " + age;
	}
}
