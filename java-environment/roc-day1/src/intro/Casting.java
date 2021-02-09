package intro;

public class Casting {
	public static void main(String[] args) {
		int num = 10;
		// we don't need to cast, because double
		// is larger than int.
		double number = num;

		double value = 10.0;
		// we need to cast double to int, because
		// int is smaller than double
		int val = (int) value;

		int i = 123456789;
		byte b = (byte) i;
		System.out.println(b);

		/*
		 * When we move between datatype, 
		 * we truncate the binary values for 
		 * the data:
		 * ex 8 bits to 4 bits: 
		 * 0101 1101 - 8 bits holds all the data
		 * 
		 * 1101 - 4 bits truncates the left-most 
		 * bits
		 */
	}
}
