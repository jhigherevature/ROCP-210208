package com.revature.joseph.designpatterns;


/*
 * The Singleton design pattern is achieved by creating a class with a 
 * method that will create a new instance of an object IF one does not
 * already exist, otherwise it will return a reference to that already
 * existing object.
 * 
 * There are numerous ways that we can implement a single pattern, however
 * to make sure the object cannot be instantiated in any other way, we 
 * will make the constructor private!
 */
public class SingletonSimulator {

	public static void main(String[] args) {
		// Cannot create objects using private constructor
//		LazySingleton single = new LazySingleton();
		LazySingleton lazy1 = LazySingleton.getTheSingletonNow();
		LazySingleton lazy2 = LazySingleton.getTheSingletonNow();
		
		System.out.println("=========== ===========");
		System.out.println("Lazy Singleton: ");
		System.out.println(lazy1 == lazy2);
		
		System.out.println("=========== ===========");
		System.out.println("Eager Singleton: ");
		EagerSingleton eager1 = EagerSingleton.getEagerSingleton();
		EagerSingleton eager2 = EagerSingleton.getEagerSingleton();
		System.out.println(eager1 == eager2);
	}

}
