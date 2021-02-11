package doWhile;

public class Exercise {

	public static void main(String[] args) {

		// Exercise 1
		int i = 1;
		do {
			System.out.println(i);
			i += 2;
		} while (i <= 49);

		// Exercise 2
		char letter = 'a';
		do {
			System.out.print(letter + " ");
			letter++;
		} while (letter <= 'z');
	}

}
