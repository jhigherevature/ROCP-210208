package conditionals;

public class SwitchSimulator {

	public static void main(String[] args) {
		String grade = "A";
		switch (grade) {
		default:
			System.out.println("Sorry your grade was really low!");
			break;
		case "A":
			System.out.println("You got an A!");
		case "B":
			System.out.println("You got a B!");
		case "C":
			System.out.println("You got a C!");
		case "D":
			System.out.println("You got a D!");
			break;
		}
		
		if (grade == "A") {
			System.out.println("You got an A!");
		} else if(grade == "B") {
			System.out.println("You got an B!");
		}
	}
}
