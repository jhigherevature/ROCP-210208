package accesslevelstwo;

import accesslevels.AccessModifiers;
import accesslevels.Bean;

public class PackTwoSimulator {
	public static void main(String[] args) {
		System.out.println("Public Level:" + AccessModifiers.pubString);
		/*
		 * Protected* and Default cannot be accessed outside of the package
		 * the data is declared
		 * 
		 * *protected data CAN be accessed if there is a sub-class relationship
		 * established
		 */
//		System.out.println("Protected Level:" + AccessModifiers.proString);
//		System.out.println("Default Level:" + AccessModifiers.defString);
		
//		System.out.println(AccessModifiersChild.proString);
		
		Bean bean = new Bean();
//		bean.word = "Other New Word";
	}
}
