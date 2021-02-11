package MethodsWithReturnType;

public class exercise2 {
		
		public char[] getAlphabetArray() {
			char temp = 'a';
			//instantiating array to a fixed value of 26 elements
			char chArray[] = new char[26];
			
			//adding each letter to the array
			for(int x=0; x<chArray.length; x++) {
				chArray[x]=temp;
				temp++;
			}
			return chArray;
		}
	
	public static void main(String[] args) {
		
		exercise2 ex2 = new exercise2();
		char [] charr = ex2.getAlphabetArray();
		
		//displaying the array
		for(int x=0; x<26;x++)
		{
			System.out.println(charr[x]);
		}

	}

}
