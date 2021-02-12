package com.revature.collections;

/*
 * Using an '*' asterisk with an import statement is called a wildcard
 * indicator, meaning that you want everything from that package
 */
import java.util.*;

public class CollectionSimulator {

	public static void main(String[] args) {
		List<User> users = new ArrayList<User> ();
		
		users.add(new User("Joseph", "Highe", "joseph.highe@revature.com", "123"));
		users.add(new User("John", "Smith", "john.smith@revature.com", "123"));
		users.add(new User("Sally", "Smith", "sally.smith@revature.com", "123"));
		users.add(new User("Steve", "Smith", "steve.smith@revature.com", "123"));
		
		for (int i = 0; i < users.size(); i++) {
			// we use the get method to access info using the index
			System.out.println(users.get(i));
		}

//		int[] nums = new int[] {1,2,3,4};
//		for(int n : nums) {
//			System.out.println(n);
//		}
		
		for (Object u : users) {
			System.out.println(u);
			System.out.println(((User)u).getFirstName());
		}
	}
}
