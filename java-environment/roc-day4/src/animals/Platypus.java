package animals;

public class Platypus extends Animal implements Carnivorous {

	public Platypus(String name, int age) {
		super(name, "Platypus", age);
	}

	@Override
	public void eat(String food) {
		System.out.println("Yep, I eat meat!");
	}
	
	public void poisonSomething() {
		
	}
}
