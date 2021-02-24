package intro;

public class Simulator {
	public static void main(String[] args) {
		// Code Comments are not executed by the JVM
		
		// Code Comments come in 2 flavors, single line
		
		/*
		 * And Multi-line comments
		 * 
		 * 
		 */
		System.out.println("Dog 1:");
					// This is the Dog Constructor
		Dog scoob = new Dog();
		/* the 'new' keyword is used to create
		 * an object with constructors. It tells Java
		 * that you want a 'new' object  
		 */
		

		System.out.println(scoob.name);
		scoob.age = 7;
		scoob.name = "Scooby Doo";
		scoob.breed = "Great Dane";

		Dog fido = new Dog();
		fido.name = "Fido";
		fido.age = 3;
		fido.breed = "Blue Heeler";
		

		
		System.out.println("Dog 2:");
		System.out.println(fido.name);
	}
}
