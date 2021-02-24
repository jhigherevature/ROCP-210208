package com.revature.comparisons;

import java.util.Comparator;

public class DataComparator implements Comparator<Data> {

	@Override
	public int compare(Data o1, Data o2) {
		if (o1.getNum() > o2.getNum()) {
			return 1;
		} else if (o1.getNum() < o2.getNum()) {
			return -1;
		} else {
			return 0;
		}
	}
	
}
