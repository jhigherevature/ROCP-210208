package animals;

public class AnimalSimulator {

	public static void main(String[] args) {
		Animal anim = new Dog("Barky",3);
		
		Dog dog = new Dog("Fido",1);
		dog.name = "Fido";
		dog.myCollar.ownerName = "Joseph";
		Shark shark = new Shark("Sully", 2);
		shark.name = "Sully";

		GoldenRetriever gr = new GoldenRetriever();
		gr.wagTail(); // comes from GoldenRetriver Class
		gr.bark();// comes from dog class
//		Dog scooby = new Dog();
//		scooby.bark();
		
		Dog dil = new GoldenRetriever();
		dil.bark();
		
		// We can use casts (unary operator) on objects
		// where there is an is-a (inheritance) relationship
		((GoldenRetriever)dil).wagTail();
	}
}
