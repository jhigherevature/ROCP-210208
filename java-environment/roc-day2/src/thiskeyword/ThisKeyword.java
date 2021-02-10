package thiskeyword;

public class ThisKeyword {
	int i;
	double value;

	public static void main(String[] args) {
		ThisKeyword th_1 = new ThisKeyword();
		th_1.i = 5;
		ThisKeyword th_2 = new ThisKeyword();
		th_2.i = 100;
		
		
		ThisKeyword th_3 = new ThisKeyword();
		
		System.out.println(th_1.i); // 5
		System.out.println(th_2.i); // 100
		
		th_1.changeI(); // invoked on th_1
		System.out.println(th_1.i); // 15
		System.out.println(th_2.i); // 100
		
		th_2.changeI();
		System.out.println(th_1.i); // 15
		System.out.println(th_2.i); // 15
	}

	public void changeI () {
		i = 25;
	}
	
	// The this keyword can be used to distinguish
	// between the variables on an object and the
	// parameters of a method
	public void setI(int i) {
		this.i = i;
	}
	
	public int getI() {
		return i;
	}
}
