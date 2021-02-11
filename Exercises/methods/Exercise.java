package methods;

public class Exercise {

	public int randomNumber() {

		double d = Math.random();

		return (int) (d * (50 - 1)) + 1;
	}

	public static void main(String[] args) {
		Exercise ex = new Exercise();
		System.out.println(ex.randomNumber());
	}
}
