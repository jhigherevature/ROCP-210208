package conditionals;

public class Ternary {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		/*
		 * (condition) ? expression_to_return_if_true : expression_to_return_if_false
		 */
		String result = (a > b) ? "A is greater" : "B is greater";
		System.out.println(result);
		
		
		String words;
		if (a > b) {
			words = "A is greater";
		} else {
			words = "B is greater";
		}
		System.out.println(words);
	}

}
