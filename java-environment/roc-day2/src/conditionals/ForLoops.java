package conditionals;

public class ForLoops {

	public static void main(String[] args) {
//		for (int i = 0; i <= 5 ; i++) {
//			System.out.println("Start of For-Loop");
//			System.out.println(i);
//			if (i % 2 == 1) {
//				continue;
//			}
//			System.out.println("End of For-Loop");
//		}

		// char is indicated with single quote
		outer: for (char a = 'a'; a <= 'd'; a++) {
			inner: for (int j = 0; j <= 4; j++) {
				System.out.println(a + " : " + j);
				if (j == 2) {
					break outer;
				}
			}
		}

		// we can nest many loops together, and use labels to control
		// more complex logic
//		int i = 100;
//		loop1:while (i > 0) {
//			System.out.println("This is the outer loop");
//			loop2:while (true) {
//				System.out.println("This is the inner loop");
//				loop3:while(true) {
//					loop4:while(true) {
//						break loop1;
//					}
//				}
//			}
//		}
		int value = 0;
		loop: while (true) {
			check: switch (value) {
			case 1:
				break loop;
			}
		}

		int nums[] = { 14, 67, 75, 213 };
		System.out.println("Standard For loop:");
		for (int i = 0; i < nums.length - 1; i++) {
			System.out.println(nums[i]);
		}

		System.out.println("Enhanced For loop:");
		for (int i : nums) {
			System.out.println(i);
		}
	}

}
