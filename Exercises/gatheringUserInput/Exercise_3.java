package gatheringUserInput;

import java.util.Scanner;

public class Exercise_3 {

	public double convertFeetToInches(double feet) {
		return feet * 12;
	}

	public double convertFeetToYard(double feet) {
		return feet / 3;
	}

	public double convertFeetToMiles(double feet) {
		return feet / 5280;
	}

	public double convertMetersToMiles(double meters) {
		return meters / 1609.34;
	}

	public static void main(String[] args) {

		Exercise_3 ex = new Exercise_3();

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		loop: while (true) {
			instructions();
			String menu = scan.next();
			System.out.println("Enter a value to convert: ");
			selection: switch (menu) {
			case "1": {
				double feet = scan.nextDouble();
				double inches = ex.convertFeetToInches(feet);
				System.out.println(feet + " Feet = " + inches + " Inches");
				break selection;
			}
			case "2": {
				double feet = scan.nextDouble();
				double yards = ex.convertFeetToYard(feet);
				System.out.println(feet + " Feet = " + yards + " Yards");
				break selection;
			}
			case "3": {
				double feet = scan.nextDouble();
				double miles = ex.convertFeetToMiles(feet);
				System.out.println(feet + " Feet = " + miles + " Miles");
				break selection;
			}
			case "4": {
				double meters = scan.nextDouble();
				double miles = ex.convertMetersToMiles(meters);
				System.out.println(meters + " Meters = " + miles + " Miles");
				break selection;
			}
			default:
				System.out.println("Try Again");
				break selection;
			case "q":
				System.out.println("Thank you for Using");
				break loop;
			}
		}
		scan.close();
	}

	public static void instructions() {
		System.out.println("Input 1 to covert Feet to Inches");
		System.out.println("Input 2 to covert Feet to Yards");
		System.out.println("Input 3 to covert Feet to Miles");
		System.out.println("Input 4 to covert meters to Miles");
		System.out.println("Select 'q' to quit");
	}
}
