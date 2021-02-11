package nestedLoops;

public class Exercise {

	public void getNames(String[] firstNames, String[] lastNames) {
		for (int i = 0; i < firstNames.length; i++) {
			for (int j = 0; j < lastNames.length; j++) {
				System.out.println(firstNames[i] + " " + lastNames[j]);
			}
		}
	}

	public static void main(String[] args) {

		String[] firstNames = { "Adam", "Alexis", "Dennis", "Jose", "Jessica", "Meghan", "Memphis", "Nicky", "Sarah",
				"William" };
		String[] lastNames = { "Adamson", "Bond", "Brown", "Johnson", "Gallagher", "Smith", "Thompson", "Perez", "Snow",
				"Tran" };
		Exercise ex = new Exercise();
		ex.getNames(firstNames, lastNames);

	}
}
