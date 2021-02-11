package MethodsWithReturnType;
import java.lang.Math;
public class exercise1 {

	public double getPi() {
		double d = Math.PI;
		return d;
	}
	
	public static void main(String[] args) {
		exercise1 ex1 = new exercise1();
		System.out.println(ex1.getPi());

	}

}
