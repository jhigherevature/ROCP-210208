package com.revature.comparisons;

public class Data implements Comparable<Data> {
	private int num;
	private long lnum;
	
	@Override
	public int compareTo(Data input) {
		if (this.num > input.getNum()) {
			return -1;
		} else if (this.num < input.getNum()) {
			return 1;
		} else {
			return 0;
		}		
	}
	
	public Data(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "["+this.num+"]";
	}


}
