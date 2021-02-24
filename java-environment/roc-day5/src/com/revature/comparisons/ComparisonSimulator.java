package com.revature.comparisons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComparisonSimulator {	
	public static void main(String[] args) {
		
		Data d_1 = new Data(3);
		Data d_2 = new Data(5);
		Data d_3 = new Data(37);
		Data d_4 = new Data(101);
		Data d_5 = new Data(18);

		Data[] datas = {d_1,d_2,d_3,d_4,d_5};		
		
		System.out.println("Comparable:");
		System.out.println(Arrays.toString(datas));
		Arrays.sort(datas);
		System.out.println(Arrays.toString(datas));
		
		System.out.println("Comparator:");
		ArrayList<Data> list = new ArrayList<Data> ();
		list.add(d_1);
		list.add(d_2);
		list.add(d_3);
		list.add(d_4);
		list.add(d_5);
		System.out.println(list);
		Collections.sort(list, new DataComparator());
		System.out.println(list);
	}
}
