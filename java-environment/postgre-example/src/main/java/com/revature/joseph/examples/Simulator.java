package com.revature.joseph.examples;

public class Simulator {
	
	public static void main(String[] args) {
		// You can also take the returned value from a method to make decisions
		// for what code you want to execute...
		int menuOneChoice = MenuOne.menuOne();
		if (menuOneChoice == 1) {
			MenuTwo.menuTwo();
		} else if (menuOneChoice == 2) {
			MenuThree.menuThree();
		}

		// Notice how the code is executed in order. After exiting one method's loop, we 
		// return to the main menu, right where we left off...
//		System.out.println("WE ARE BACK IN THE MAIN MENU");
//		for (int i = 0; i < 5; i++) {
//			System.out.println("i is: " + i);
//		}
//		MenuTwo.menuTwo();
//		System.out.println("WE ARE BACK IN THE MAIN MENU");
//		for (int i = 0; i < 5; i++) {
//			System.out.println("i is: " + i);
//		}
//		MenuThree.menuThree();
	}
}
