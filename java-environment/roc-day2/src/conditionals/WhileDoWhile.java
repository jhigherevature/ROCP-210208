package conditionals;

public class WhileDoWhile {

	public static void main(String[] args) {
		int i = 0;
		System.out.println("i before: " + i);
		while(i > 0) {
			System.out.println(i);
			i--;
		}
		System.out.println("i after: " + i);

		
		int j = 15;
		System.out.println("j before: " + j);
		do {
			System.out.println(j);
			j++;
		} while(j < 10);
		System.out.println("j after: " + j);
	}

}
