package MethodsWithParameter;

public class exercise2 {

	public String findFirstWord(String str1, String str2) {

		if(str1.compareTo(str2)>0)
			return str2;
		else
			return str1;
		
}
	public static void main(String[] args) {
		
		exercise2 word = new exercise2();
		System.out.println(word.findFirstWord("aab", "acc"));

	}

}
