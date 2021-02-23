package com.revature.joseph.lambdas;

public class LambdaSimulator {
	public static void main(String... args) {
//		HelloWorldInterface hello = new HelloWorldObject();
//		hello.hello();
		
		HelloWorldInterface helloLam = () -> { System.out.println("Hello World!"); };
		helloLam.hello();
		
		FuncInterface<Integer> fi = (Integer i) -> { 
			System.out.println(i + 25);
			System.out.println("This was the next step. Lets divide:");
			System.out.println(i / 5);
		};
		fi.doSomething(50);
	}
}
