package whileLoop;

public class Exercise {

	public static void main(String[] args) {

		// Exercise 1
		// For this exercise, you need to write a while loop that prints the numbers 1
		// through 10, inclusively each on a separate line.
		int num = 1;
		while (num <= 10) {
			System.out.println(num);
			num++;
			if (num > 10)
				break;
		}

		// Exercise 2
		// For this exercise, you must write a while loop that prints all of the even
		// numbers 100 to -100, inclusively, each on a separate line.

		int number = -100;
		while (number <= 100) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
			number++;
			if (number > 100)
				break;
		}

	}

}
