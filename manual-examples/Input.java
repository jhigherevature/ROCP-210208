public class Input {
	/*
	 * use the java command to execute this program
	 * pass arguments as Strings following the file name:
	 * ex: java Input Hello World
	 */
	public static void main(String... args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}