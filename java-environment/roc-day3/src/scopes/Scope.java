package scopes;

public class Scope {

	public String instanceScope = "This is the Instance Scope String"; 
	public static String staticScope = "This is the Static/Class Scope String";
	
	public static void main(String[] args) {
		Scope scope = new Scope();
		System.out.println("Inside the main method:");
		System.out.println("instance variable: " + scope.instanceScope);
//		System.out.println("method Scope:" + scope.methodScope); // error
		scope.method();
		System.out.println("static variable: " + staticScope);
		Scope s = new Scope();
		s.otherMethod();
	}
	
	public void otherMethod() {
		String blockScope;
		String instanceScope = "InstanceScope inside method";
		System.out.println(instanceScope);
		System.out.println(this.instanceScope);
		if (true) {
//			String instanceScope = "Another";
		}
	}
	
	public void method() {
		String instanceScope = "New Instance Scope"; // 
		String methodScope = "This is a method scope string";
		System.out.println("Inside the method:");
		System.out.println("method Scope:" + methodScope);
		System.out.println("instance Scope:" + instanceScope);
		if (true) {
			String blockScope = "This is the block scope string";
			System.out.println("Inside the if-statement:");
			System.out.println("block Scope:" + blockScope);
			System.out.println("method Scope:" + methodScope);
			System.out.println("instance Scope:" + instanceScope);
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			System.out.println(methodScope);
		}
//		System.out.println(i);
			
//		System.out.println("block Scope:" + blockScope); // error
	}
}
