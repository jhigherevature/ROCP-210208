package conditionals;

public class Simulator {

	public static void main(String[] args) {
		int x = 10;
		int y = 100;
		/*
		 * Conditional statements apply to the next line OR 
		 * block of code
		 */
//		if (x > y)
//			System.out.println("X is greater than y!");
//		else
//			System.out.println("X is not greater than y");
		
		
		if (x > y) {
			System.out.println("X is too big for me");
			x = y - 1;
			System.out.println("Thats better! x is: " + x);
		}
		
		
		int z = 21;
		if (z == 10) {
			System.out.println("z is 10");
		} else if (z % 2 == 1) {
			System.out.println("Not 10 and odd");
		} else if (z % 2 == 0) {
			System.out.println("Z is even");
		} else if (z > 10) {
			System.out.println("Not odd and more than 10");
		} else {
			System.out.println("Too many conditions!");
		}
		
		int age = 21;
		boolean adultSupervised = false;
		if (!adultSupervised) {
			// some code you want to occur in this case!
			if (age >= 18) {
				System.out.println("You can watch the rated R movie");
			}
		} else {
			if (age > 15) {
				System.out.println("You can watch the rated R movie");
			} else {
				System.out.println("Sorry you can't watch this movie");
			}
		} 
		
	}
}
