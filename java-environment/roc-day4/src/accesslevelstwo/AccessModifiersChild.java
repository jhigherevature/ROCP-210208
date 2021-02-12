package accesslevelstwo;

import accesslevels.AccessModifiers;

public class AccessModifiersChild extends AccessModifiers {
	public static void main(String[] args) {
		System.out.println("Public Level:" + AccessModifiers.pubString);
		// This information is accessible because AccessModifiersChild
		// extends the AccessModifiers Class
		System.out.println("Protected Level:" + AccessModifiers.proString);
//		System.out.println("Default Level:" + AccessModifiers.defString);
	}
}
