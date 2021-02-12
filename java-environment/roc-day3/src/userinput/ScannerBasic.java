package userinput;

import java.util.Scanner;

public class ScannerBasic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Give me input:");
		String i = scan.nextLine();
//		giveNumber();
		System.out.println("You typed: " + i);
	}
	
	public static int giveNumber() {
		return 15;
	}
}
