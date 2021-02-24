package animals;

// We use the 'extends' keyword to indicate inheritance
// between classes
public class Shark extends Animal implements Carnivorous {
	public Shark(String name, int age) {
		super(name, "Shark", age);
		System.out.println("Calling Shark Constructor");
	}

	@Override
	public void eat(String food) {
		System.out.println("Fish are friends not food!");
	}
	
	public void swim() {
		
	}
}
