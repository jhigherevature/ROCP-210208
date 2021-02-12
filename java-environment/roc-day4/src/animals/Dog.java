package animals;

public class Dog extends Animal implements Herbivorous, Carnivorous {
	Collar myCollar = new Collar();
	
	public Dog(String name, int age) {
		super(name, "Dog", age);
		System.out.println("Calling the Dog Constructor");
	}
	
	public void bark() {
		System.out.println("Woof Woof!");
	}
	
	@Override
	public void eat(String food) {
		System.out.println("I like Scooby Snacks");
	}
}
