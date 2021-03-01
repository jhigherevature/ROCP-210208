package com.examples.reflectexample;

import java.lang.reflect.*;

public class ReflectionSimulator {

	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException, SecurityException {
		Class<Frankenstein> frankClass = Frankenstein.class;
		// name of our class
		System.out.println(frankClass.getName());
		
		Frankenstein frankObject = new Frankenstein();
		
		System.out.println("Declared Methods:");
		// get all methods declared in a class, inlcuding private, protected, default
		Method[] decMethods = frankClass.getDeclaredMethods();
		for (Method m : decMethods) {
			System.out.println("\t" + m);
		}
		
		System.out.println("All Methods:");
		// get methods that are accessible to reflection class, not just the ones declared
		Method[] allMethods = frankClass.getMethods();
		for (Method m : allMethods) {
			System.out.println("\t" + m);
		}
		
		System.out.println("Constructors:");
		// We use generics for constructors, and class, to determine what type of object we are reflecting
		Constructor<Frankenstein> [] constructors = (Constructor<Frankenstein>[])frankClass.getConstructors();
		for (Constructor<Frankenstein> c : constructors) {
			System.out.println("\t" + c);
		}
		
		Constructor<Frankenstein> paramConstructor = frankClass.getDeclaredConstructor(int.class, String.class, double.class);
		System.out.println("\tparameterized constructor: " + paramConstructor);
		
		System.out.println("Declared Fields:");
		Field[] decFields = frankClass.getDeclaredFields();
		for (Field f : decFields) {
			System.out.println("\t"+f);
		}
		
		System.out.println("Visible Fields:");
		Field[] visFields = frankClass.getFields();
		for (Field f : visFields) {
			System.out.println("\t"+f);
		}
		
		System.out.println("Changing a single method:");
		// This will find the setWord method in our Frankenstein class
		Method setNameMethod = frankClass.getDeclaredMethod("setWord", java.lang.String.class);
		System.out.println(setNameMethod);
		
		setNameMethod.setAccessible(true);
		// we invoke the setNameMethod on our frankObject, and pass the parameter "Teddy"
		setNameMethod.invoke(frankObject, "Teddy");
		System.out.println(frankObject);
		
		Method paramMethod = frankClass.getDeclaredMethod("method", String.class, int.class, float.class);
		System.out.println(paramMethod);
		
		// getDeclaredField will throw an "NoSuchFieldException" and "SecurityException"
		Field idField = frankObject.getClass().getDeclaredField("id");
		idField.setAccessible(true);
		idField.set(frankObject, 19);
		System.out.println(frankObject);
		
		System.out.println("MODIFIERS:");
		System.out.println("Public: " + Modifier.PUBLIC);				// 0000 0000 0001
		System.out.println("Private: " + Modifier.PRIVATE);				// 0000 0000 0010
		System.out.println("Protected: " + Modifier.PROTECTED);			// 0000 0000 0100
		System.out.println("STATIC: " + Modifier.STATIC);				// 0000 0000 1000
		System.out.println("Final: " + Modifier.FINAL);					// 0000 0001 0000
		System.out.println("Sychronized: " + Modifier.SYNCHRONIZED);	// 0000 0010 0000
		System.out.println("Volatile: " + Modifier.VOLATILE);			// 0000 0100 0000
		System.out.println("Transient: " + Modifier.TRANSIENT);			// 0000 1000 0000
		System.out.println("Native: " + Modifier.NATIVE);				// 0001 0000 0000
		System.out.println("Interface: " + Modifier.INTERFACE);			// 0010 0000 0000
		System.out.println("Abstract: " + Modifier.ABSTRACT);			// 0100 0000 0000
		System.out.println("Strict: " + Modifier.STRICT);				// 1000 0000 0000
		
		System.out.println("Field Modifiers:");
		for (Field f : decFields) {
			int mod = f.getModifiers();
			System.out.println("\t"+f);
			System.out.println("\t\t" + Modifier.isPublic(mod));
			System.out.println("\t\t" + Modifier.isStatic(mod));
		}
		
		System.out.println("Parameters:");
		for (Method m : decMethods) {
			System.out.println("\t" + m);
			Parameter[] mParams = m.getParameters();
			for (Parameter p : mParams) {
				System.out.println("\t\t" + p);
			}
		}
	}

}
