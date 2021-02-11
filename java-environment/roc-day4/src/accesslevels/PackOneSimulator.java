package accesslevels;

public class PackOneSimulator {

	public static void main(String[] args) {
		System.out.println("Public Level:" + AccessModifiers.pubString);
		System.out.println("Protected Level:" + AccessModifiers.proString);
		System.out.println("Default Level:" + AccessModifiers.defString);
		/*
		 * Private data can only be accessed from the class it is
		 * created!
		 */
//		System.out.println("Private Level:" + AccessModifiers.priString);
		
		Bean bean = new Bean();
		
		System.out.println(bean.getWord());
	}

}
