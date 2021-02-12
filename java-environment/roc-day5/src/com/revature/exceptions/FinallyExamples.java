package com.revature.exceptions;

public class FinallyExamples {
	public static void main(String[] args) {
//		stackOverflowTest();
		finallyTest(true);
	}
	
	public static void finallyTest(boolean isSystemExitCalled) {
		System.out.println("We just called finallyTest!");
		try {
			System.out.println("Now we are inside the try-block");
			System.out.println("Was System.exit() called? " + isSystemExitCalled);
			
			if (isSystemExitCalled) {
				System.exit(0);	// exit(0) is a full stop on your program
			}
		} finally {
			System.out.println("Finally will ALWAYS execute, unless there "
					+ "is a call to System.exit() or a catastophic system failure");
		}
	}
	
	
	public static void stackOverflowTest() {
		try {
			recursion(1000000000);
		} finally {
			System.out.println("Finally will ALWAYS execute, unless there "
					+ "is a call to System.exit() or a catastophic system failure");
		}
	}
	
	public static int recursion(int value) {
		return value * recursion(value--);
	}
}
