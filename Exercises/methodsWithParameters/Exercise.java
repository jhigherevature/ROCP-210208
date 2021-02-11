package methodsWithParameters;

import java.util.Arrays;

public class Exercise {

	// Exercise 1
	public float[] square(int a, int b, int c, int d) {

		float[] squares = new float[4];
		squares[0] = a * a;
		squares[1] = b * b;
		squares[2] = c * c;
		squares[3] = d * d;
		return squares;
	}

	// Exercise 2
	public String findFirstWord(String stringOne, String stringTwo) {

		if (stringOne.compareToIgnoreCase(stringTwo) < 0) {
			return stringOne;
		} else {
			return stringTwo;
		}
	}

	// Exercise 3
	public void displayArrayStatistics(int[] a, int[] b) {

		int noOfEveninA = 0, noOfEveninB = 0, multiplesOf_3inA = 0, multiplesOf_3inB = 0;

		if (a.length > b.length) {
			System.out.println("A contains more data");
		} else if (b.length > a.length) {
			System.out.println("B contains more data");
		}

		for (int arr : a) {
			if (arr % 2 == 0) {
				noOfEveninA++;
			}
			if (arr % 3 == 0) {
				multiplesOf_3inA++;
			}
		}

		for (int arr : b) {
			if (arr % 2 == 0) {
				noOfEveninB++;
			}
			if (arr % 3 == 0) {
				multiplesOf_3inB++;
			}
		}

		if (noOfEveninA > noOfEveninB) {
			System.out.println("A contains more even numbers");
		} else if (noOfEveninB > noOfEveninA) {
			System.out.println("B contains more even numbers");
		} else {
			System.out.println("Both contain equal number of even numbers");
		}

		if (multiplesOf_3inA > multiplesOf_3inB) {
			System.out.println("A contains more multiplies of 3");
		} else if (multiplesOf_3inB > multiplesOf_3inA) {
			System.out.println("B contains more multiplies of 3");
		} else {
			System.out.println("Both contain equal number of multiplies of 3");
		}
	}

	public static void main(String[] args) {

		Exercise ex = new Exercise();

		System.out.println(Arrays.toString(ex.square(5, 3, 2, 8)));

		System.out.println(ex.findFirstWord("Dallas", "Irving"));

		int[] a = { 3, 8, 9, 12, 8 };
		int[] b = { 9, 5, 12, 20, 5, 8, 10 };
		ex.displayArrayStatistics(a, b);
	}
}
