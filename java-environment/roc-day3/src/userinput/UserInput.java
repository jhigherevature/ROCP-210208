package userinput;

import java.util.Scanner;

/*
 * package structure:
 * package declaration
 * import statments
 * class declaration
 * 
 * In eclipse (and STS) to auto import, type
 * SHIFT + CTRL + O [windows]
 * SHIFT + CMD + O [mac]
 */
public class UserInput {
	int value = 5;
	
	/*
	 * ALT + SHIFT + S to access source menu
	 */
	
	// annotation provide meta data and functionality to 
	// our code.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInput other = (UserInput) obj;
		if (value != other.value)
			return false;
		return true;
	}

	public static void main(String[] args) {
		@SuppressWarnings(value = { "resource" })
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Give me a number:");
		int menu = scan.nextInt();
		loop: while (true) {
			System.out.println("Give me another Number:");
			menu = scan.nextInt();
			selection: switch (menu) {
			case 1:
				System.out.println("This is the first section");
				break selection;
			case 2:
				System.out.println("This is the second");
				// invoke methods
				// call method that makes connection to DB
				// call method that passes info to DB
				break selection;
			case 3:
				System.out.println("Thanks for using!");
				break loop;
			default:
				break selection;
			}
		}
		
		// it is best practice to close resources when
		// you are done using them
		scan.close();
	}
}
