package accesslevels;

public class AccessModifiers {
	public static String pubString = "Public Access";
	protected static String proString = "Protected Access";
	static String defString = "Default/Package-Private Access";
	static private String priString = "Private Access";
	
	public static void main(String[] args) {
		System.out.println("Public Level:" + pubString);
		System.out.println("Protected Level:" + proString);
		System.out.println("Default Level:" + defString);
		System.out.println("Private Level:" + priString);
	}
}
