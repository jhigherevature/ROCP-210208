package intro;

public class PrimitiveTypes {
	byte b;
	short s;
	char c;
	int i;
	long l;
	float f;
	double d;
	boolean bool;
	
	// CTRL + Space for the quick menu
	public static void main(String[] args) {
		PrimitiveTypes pt = new PrimitiveTypes();
		pt.b = 12;
		System.out.println("b : " + pt.b);
		System.out.println("s : " + pt.s);
		System.out.println("c : " + pt.c);
		System.out.println("i : " + pt.i);
		System.out.println("l : " + pt.l);
		System.out.println("f : " + pt.f);
		System.out.println("d : " + pt.d);
		System.out.println("bool : " + pt.bool);
	}		
}
