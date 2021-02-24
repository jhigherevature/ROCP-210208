package arrays;

public class VarArgs {

	public static void main(String... args) {
		VarArgs va = new VarArgs();
		// We can pass an arbitrary amount of numbers
		va.printData(13, 123,23,143,53);
		// even no values for varargs!
		va.printData(3);
	}
	
	public void printData(int a, int... inputs) {
		System.out.println(a);
		for (int i = 0; i < inputs.length; i++) {
			System.out.println(inputs[i]);
		}
	}

}
