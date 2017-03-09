package reusing;

import java.util.*;

class A {
	A(int i){System.out.println("A constructor with arg "+i);}
}

class B {
	B(int i){System.out.println("B constructor with arg "+i);}
}

public class C extends A {

	B b;

	C(){
		super(12);
		System.out.println("C constructor ");
		b = new B(11);
	}

	public static void main (String [] args)
	{
		/* code */
//		B b = new B();
		C c = new C();
	}
}
