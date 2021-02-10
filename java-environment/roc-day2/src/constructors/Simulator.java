package constructors;

public class Simulator {

	public static void main(String[] args) {
		Example example = new Example("Joseph", 123);
		System.out.println(example.getName());
		System.out.println(example.getId());
		
		Dog d = new Dog();
		
		Animal a = new Animal("Ace");
		Animal b = new Animal("Bruce", "Badger");
		Animal c = new Animal("Charles", "Cat", 14);
	}

}
