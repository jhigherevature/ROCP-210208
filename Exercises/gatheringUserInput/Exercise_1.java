package gatheringUserInput;

import java.util.Scanner;

public class Exercise_1 {

	// Exercise 1
	public void numberOfAlphabetsInLine(String str) {

		char[] strToCharArray = str.toCharArray();
		int num = 0;

		for (int i = 0; i < strToCharArray.length; i++) {
			if (strToCharArray[i] == 'a' || strToCharArray[i] == 'e' || strToCharArray[i] == 'i'
					|| strToCharArray[i] == 'o' || strToCharArray[i] == 'u') {
				num++;
			}
		}
		System.out.println("Nummber of vowels you input in the line are: " + num);
	}
	
	public static void main(String[] args) {

		Exercise_1 ex = new Exercise_1();

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me input to find number of vowels in line:");
		String str = scan.next();

		ex.numberOfAlphabetsInLine(str);

	}

}
