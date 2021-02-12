package animals;

public class Rabbit extends Animal implements Herbivorous {

	public Rabbit(String name, int age) {
		super(name, "Rabbit", age);
	}
	
	public void scurry() {
	System.out.println("What's up doc");	
	}
}
