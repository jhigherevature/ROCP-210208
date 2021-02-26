package com.examples.garbage;

public class GarbageSimulator {
	public static void main(String[] args) {
		for (int i = 0; i < 1000000; i++) {
			Rubbish r = new Rubbish(i);
			System.gc();
		}
	}
}
