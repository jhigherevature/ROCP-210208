package forLoop;


public class ExerciseForLoop {

	public static void main(String[] args) {

		int[] array = { 8, 4, 6, 2, 99, 33, 34, 56, 23, 67 };

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("\nUsing for each loop");
		for(int arr : array) {
			System.out.println(arr);
		}

	}

}
