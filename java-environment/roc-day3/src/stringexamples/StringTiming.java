package stringexamples;

public class StringTiming {
	static int n = 10000;
	public static void main(String[] args) {
		createAlotOfStrings();
		createAlotStringBuilder();
		createAlotStringBuffer();
	}
	
	public static void createAlotOfStrings() {
		String s = "";
		long timeInit = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			s = s.concat("a");
		}
		long timeEnd = System.currentTimeMillis();
		System.out.println("Strings took: " + (timeEnd-timeInit) + " ms");
	}
	
	public static void createAlotStringBuilder() {
		StringBuilder sb = new StringBuilder("");
		long timeInit = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			sb.append("a");
		}
		long timeEnd = System.currentTimeMillis();
		System.out.println("String Builder took: " + (timeEnd-timeInit) + " ms");
	}
	
	public static void createAlotStringBuffer() {
		StringBuffer sb = new StringBuffer("");
		long timeInit = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			sb.append("a");
		}
		long timeEnd = System.currentTimeMillis();
		System.out.println("String Buffer took: " + (timeEnd-timeInit) + " ms");
	}

}
