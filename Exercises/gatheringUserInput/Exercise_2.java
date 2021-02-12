package gatheringUserInput;

import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a number: ");
		
		loop: while (true) {
			String menu = scan.next();
			selection: switch (menu) {
			case "1":
				System.out.println("Moving Right");
				break selection;
			case "2":
				System.out.println("Moving Left");
				break selection;
			case "3":
				System.out.println("Moving Up");
				break selection;
			case "4":
				System.out.println("Moving Down");
				break selection;
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
}
