package com.revature.joseph.designpatterns;

/*
 * Eager instantation of an object ensures that the JVM
 * will load the object into memory, even before the main
 * method begins execution. The object will exist throughout
 * the lifetime of our application!
 */
public class EagerSingleton {
	private int value;
	
	/*
	 * When this class is loaded into memory, it will create a
	 * new instance of the Eager singleton object. This means
	 * that our Eager Singleton will be available throughout
	 * the lifetime of our entire application!
	 */
	private static EagerSingleton mySingleton = new EagerSingleton();
	
	private EagerSingleton() { }
	
	public static EagerSingleton getEagerSingleton() {
		return mySingleton;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
