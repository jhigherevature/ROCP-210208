package wrappers;

public class WapperSimulator {
	public static void main(String[] args) {
		int num = 9;
		Integer number = num;
		Object object = new Object();
		
		int[] nums = new int[3];
		Integer[] numbers = new Integer[3];
		
		System.out.println(number.equals(9));
		
		Object[] obj = new Object[] {number};
		
		// Wrapper classes provide methods (some static) that
		// give us more functionality. Like changing Strings
		// to numbers
		num = Integer.parseInt("25");
		System.out.println(num);
	}
}
