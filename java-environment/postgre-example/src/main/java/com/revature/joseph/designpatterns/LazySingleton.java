package com.revature.joseph.designpatterns;

/*
 * Lazy Instantiation refers to the creation of an object only
 * when it is needed and not before. This is helpful when you
 * want to reserve certain space in memory or resources for your
 * application until it is needed.
 */
// LazySingleton is our class
public class LazySingleton {
	private int value;
	
	private static LazySingleton mySingleton;
	
	/* 
	 * This is our private constructor. By making the constructor
	 * private, we stop any other class from creating LazySingleton
	 * objects directly.
	 */
	private LazySingleton() { }
	
	// This method is the ONLY way to create our LazySingleton object
	public static LazySingleton getTheSingletonNow() {
		if (mySingleton == null) {
			System.out.println(mySingleton);
			mySingleton = new LazySingleton();
			return mySingleton;
		} else {
			return mySingleton;
		}
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	/*
	 * When using a singleton pattern, it is important to override
	 * the clone() method from the object class. This is used to 
	 * prevent the duplication of a singleton object which
	 * would ultimately defeat the purpose of this design pattern
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
