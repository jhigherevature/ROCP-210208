package overloading;

import java.util.Arrays;

public class OverloadingPrecedence {
	/* primitives:
	 * boolean
	 * byte - 0000 0000 = 256: -128 to +127
	 * short
	 * char
	 * int [default]
	 * long
	 * float
	 * double [default]
	 */
	public static void main(String[] args) {
//		Byte b = 128; // this byte value is too big
		
		method(5);
		method((short)5);
		method((long)5);
		/*
		 * 1 - Exact Match
		 * 
		 * 2. Implicitly upcast
		 * -byte to: short, int, long, float or double
		 * -short to: int, long, float or double
		 * -int to: long, float, double
		 * -long to: float, double
		 * -float to: double
		 * 
		 * 3. Implicity Box:
		 * -byte to: Byte
		 * -short to: Short
		 * -int to: Integer
		 * -long to: Long
		 * -float to: Float
		 * -double to: Double
		 * 
		 * 4. Varargs...
		 */
		
		method((short)5,5);
		method((long)5,5,5,5);
	}
	
	public static void method(int i) {
		System.out.println("primitive int: " + i);
	}
	
	public static void method(long l) {
		System.out.println("primitive long: " + l);
	}
	
	public static void method(short s) {
		System.out.println("primitive short: " + s);
	}
	
	public static void method(short a, int b) {
		System.out.println("short " + a + " and int: " + b);
	}
	
	public static void method(int... i) {
		System.out.println("varargs: " + Arrays.toString(i));
	}
	
	public static void method(long a, Integer...b) {
		System.out.println("wrappers: " + Arrays.toString(b));
	}
	
}
