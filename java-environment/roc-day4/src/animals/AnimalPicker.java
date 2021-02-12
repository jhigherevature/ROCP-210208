package animals;

import java.util.Scanner;

public class AnimalPicker {

	public static void main(String[] args) {
		Animal anim = null;
		
//		Herbivorous herb = new Herbivorous(); // cannot create interfaces directly

		Scanner scan = new Scanner(System.in);

		loop:while (true) {
			printOptions();
			int menu = scan.nextInt();
			selection:switch (menu) {
			case 1:
				anim = new Dog("Doug", 5);
				break selection;
			case 2:
				anim = new Rabbit("Buggs", 60);
				break selection;
			case 3:
				anim = new Shark("Sully", 14);
				break selection;
			case 4:
				anim = new Platypus("Perry", 4);
				// invoke methods here
				break selection;
			case 5:
				break loop;
			}

			System.out.println(anim); // toString() method on Animal Class
//		((Shark)anim).swim(); // we cannot guarantee this functionality without
							// first checking the instanceof this object

			if (anim instanceof Dog) {
				((Dog) anim).bark();
			}

			if (anim instanceof Herbivorous) {
				((Herbivorous) anim).eat("Fruits");
			}
		}
	}
	
	public static void printOptions() {
		System.out.println("Enter a number:");
		System.out.println("1 for Dog");
		System.out.println("2 for Rabbit");
		System.out.println("3 for Shark");
		System.out.println("4 for Platypus");
		System.out.println("5 to quit");
	}

}
