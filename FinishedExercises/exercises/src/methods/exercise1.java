package methods;
import java.lang.Math;
public class exercise1 {

	//method
	public int randomNumber() {
		int number = 50;
		double mul= Math.random();	
		number *= mul;
		return number;
	}
	//main method
	public static void main(String[] args) {
		exercise1 ex1 = new exercise1();
		System.out.println(ex1.randomNumber());

	}


}
