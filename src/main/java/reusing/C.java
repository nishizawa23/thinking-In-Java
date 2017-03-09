package reusing;

import java.util.*;

class A {
	A(){System.out.println("A constructor");}
}

class B {
	B(){System.out.println("B constructor");}
}

public class C extends A {

	B b = new B();

	public static void main (String [] args)
	{
		/* code */
//		B b = new B();
		C c = new C();
	}
}
