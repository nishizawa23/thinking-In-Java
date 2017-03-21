package polymorphism;

import java.util.*;

class Base {

	public void f(){
		System.out.println("base class f()");
		g();
	}

	public void g(){
		System.out.println("base class g()");
	}
}

class Exersice10 extends Base {

	public void g(){
		System.out.println("Exersice10 class g()");
	}

	public static void main (String [] args)
	{
		/* code */
		Base mBase = new Exersice10();
		mBase.f();
	}
}
