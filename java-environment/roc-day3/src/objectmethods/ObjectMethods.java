package objectmethods;

public class ObjectMethods {
	public static void main(String[] args) {
		Data one = new Data(10);
		Data two = new Data(10);
		Data three = new Data(5);
		Data four = one;
		System.out.println(one == two); // false
		System.out.println(one.equals(two)); // true
		System.out.println(one.equals(three));
		
		
//		System.out.println(one);
//		System.out.println(two);
//		System.out.println(three);
//		System.out.println(four);
	}
	
	public void useVarArgs(Data...datas) {
		
	}
}
