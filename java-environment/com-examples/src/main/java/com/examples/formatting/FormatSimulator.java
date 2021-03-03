package com.examples.formatting;

public class FormatSimulator {
	public static void main(String[] args) {
		String str = "Rev";
		/*
		 * The String.format method is a Static method on the String class that takes
		 * a String format argument and a varargs of objects.
		 * 
		 * The String format argument is used to display your data in some manner
		 * 
		 * We will take the raw String information from the format, and use the understood
		 * formatting options (represented by a %) to display our information
		 * 
		 * %s is used for Strings
		 */
		String format_1 = String.format("| === %10s === |", str);
		
		// %d is used for base-10 integer numbers
		String format_2 = String.format("| === %5d %-5d %d === |", 12, 123, 1234);
		
		// %n adds a new line character to your String
		String format_3 = String.format("%s %n %s %n %s %n", str, "This is the String", str);
		
		// %x is used for hexadecimal
		String format_4 = String.format("%x", 10);
		
		// %o is used for octal numbers
		String format_5 = String.format("%o",73);
		
		// %f is used for floating point decimal numbers
		String format_6 = String.format("%f",(10f/3f));
		
		System.out.println(format_1);
		System.out.println(format_2);
		System.out.println(format_3);
		System.out.println(format_4);
		System.out.println(format_5);
		System.out.println(format_6);
		System.out.println("End of the Main method");
	}
}
