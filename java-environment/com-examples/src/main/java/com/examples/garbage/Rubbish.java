package com.examples.garbage;

// This class will be used to showcase the garbage collector in action
public class Rubbish {
	public int id;
	public Rubbish (int id) {
		this.id = id;
		System.out.println("New Rubbish Created, id: " + id);
	}
	
	public void finalize() throws Throwable {
		// use \t to tab out in the println message
		System.out.println("\tRubbish ID: " + id + " heading to the Garbage");
	}
}
