package MethodsWithParameter;

public class exercise1 {
	
	public float[] method_square_(int num1, int num2, int num3, int num4) {
		//storing squared values to the array
		float arr[] = {num1*num1, num2*num2, num3*num3, num4*num4};
		return arr;
		
	}

	public static void main(String[] args) {
		//creating object
		exercise1 ex1 = new exercise1();
		//passing random test values 
		float [] temp = ex1.method_square_(2, 3, 4, 5);
		
		//loop to print out result inside array
		for(int x=0; x<temp.length ;x++) {
			System.out.println(temp[x]);
			
		}
		

	}

}
