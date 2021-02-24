package nonaccessmods;

public class FinalExample {
	final int cantChange = 15;
	
	public static void main(String[] args) {
		FinalExample fe = new FinalExample();
		System.out.println(args[15]);
//		fe.cantChange = 25; // cant change final variables
	}
}
