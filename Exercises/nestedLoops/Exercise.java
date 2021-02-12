package nestedLoops;

import java.util.Arrays;

public class Exercise {

	// Exercie 1
	public void getNames(String[] firstNames, String[] lastNames) {
		for (int i = 0; i < firstNames.length; i++) {
			for (int j = 0; j < lastNames.length; j++) {
				System.out.println(firstNames[i] + " " + lastNames[j]);
			}
		}
	}

	// Exercise 2

	public void nestedForLoop() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// Exercise 3
	public void bubbleSort() {

		int[] numbers = { 1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4 };
		int tempArray;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j - 1] > numbers[j]) {
					tempArray = numbers[j - 1];
					numbers[j - 1] = numbers[j];
					numbers[j] = tempArray;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));
	}

	// Exercise 4 Alphabet Numerical Position Skipping Vowels
	public void alphabetNumericalPosition() {

		int num = 1;

		for (char i = 'a'; i <= 'z'; i++) {
			if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
				num++;
				continue;
			}
			System.out.println(i + "---" + num);
			num++;
		}
	}

	public static void main(String[] args) {

		String[] firstNames = { "Adam", "Alexis", "Dennis", "Jose", "Jessica", "Meghan", "Memphis", "Nicky", "Sarah",
				"William" };
		String[] lastNames = { "Adamson", "Bond", "Brown", "Johnson", "Gallagher", "Smith", "Thompson", "Perez", "Snow",
				"Tran" };
		Exercise ex = new Exercise();
		ex.getNames(firstNames, lastNames);

		ex.nestedForLoop();

		ex.bubbleSort();

		ex.alphabetNumericalPosition();
	}
}
