package methodsWithReturnTypes;

import java.util.Arrays;

public class Exercise {
	
	// Exercise 1
	public double getPi() {
		double d = Math.PI;
		return d;
	}
	
	// Exercise 2
	public char[] getAlphabetArray() {
				 
		 char letter = 'a';
		 String letterAtoZ = "";
		 
		 while(letter <= 'z') {
			 letterAtoZ = letterAtoZ+letter;
			 letter++;
		 }
		 return letterAtoZ.toCharArray();
	}

	public static void main(String[] args) {
		
		Exercise ex = new Exercise();
		
		System.out.println(ex.getPi());
		
		System.out.println(Arrays.toString(ex.getAlphabetArray()));
		
	}

}
