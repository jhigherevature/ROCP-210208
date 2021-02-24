package com.revature.exceptions;

public class ExceptionSimulator {

	public static void main(String[] args) {
		/*
		 * For try-catch-finally blocks, you need a try block, but
		 * you technically do not need catch or finally, so long as you
		 * have one other the other.
		 * 
		 * Additionally, you can have multiple catch blocks
		 * When you include multiple catch blocks, more general exceptions
		 * should come later in the statement order
		 */
		try {
			AddOnlyOddNumbers(3,3);
		} catch(EvenNumberException e) {
			e.printStackTrace();
		} catch(Exception e) {
			
		} finally {
			// The finally block is generally used for some form of 
			// code cleanup
			System.out.println("This will almost always occur");			
		}
	}
	
	// we use the throws declaration in a method signature to 'duck' out of
	// the way of the thrown exception. We use this to consolidate our handling
	// of different exceptions, in a single location
	public static void AddOnlyOddNumbers(int a, int b) throws EvenNumberException {
		if (a % 2 == 0) {
			throw new EvenNumberException("First input was even!");
		} else if (b % 2 == 0) {
			throw new EvenNumberException("Second input was even!");
		}
		
		System.out.println(a + b);
	}

}
