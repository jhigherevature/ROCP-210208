package arrays;

public class ArrayExample1 {
	
	// When using arrays as method parameters
	// we can declare the array in any manner
	// this includes the main method
	public static void main(String args[]) {
		int[] nums = new int[3];
		/* 
		 * indexes are used to access data in an array
		 * 
		 * Indexes only represent the position of an item
		 * in an array.
		 * Indexes being counting at 0
		 */
		nums[0] = 5;
		nums[1] = 10;
		nums[2] = 15;
//		nums[3] = 25; // my array is not big enough!
		System.out.println(nums[0]);	// 5
		System.out.println(nums[1]);	// 10
		System.out.println(nums[2]);	// 15
		
		int[] nums_2 = new int[] {2,4,6};
		System.out.println(nums_2[0]);	// 2
		System.out.println(nums_2[1]);	// 4
		System.out.println(nums_2[2]);	// 6
		
		int[] nums_3 = {100, 200, 300};
		System.out.println(nums_3[0]);	// 100
		System.out.println(nums_3[1]);	// 200
		System.out.println(nums_3[2]);	// 300
		
		int num_4[] = new int[4]; // created an int array with 4 elements
		int [] num_5 = new int[5]; // created an int array with 5 elements
		int num_6 [] = new int[6]; // created an int array with 6 elements
	}
}
