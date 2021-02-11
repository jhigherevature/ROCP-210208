package animals;

// interfaces can only extend one other interface
public interface Herbivorous extends Digestion {
	public default void eat(String food) {
		if (food == "Veggies/Fruit") {
			
		}
	}
	
	@Override
	public default void digest() {
		System.out.println("I digest only plants and fruit");
	}
}
