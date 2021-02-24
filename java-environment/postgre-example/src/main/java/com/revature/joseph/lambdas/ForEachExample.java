package com.revature.joseph.lambdas;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charles");
		names.forEach(str -> System.out.println(str));
		
		for (String n : names) {
			System.out.println(n);
		}
	}

}
