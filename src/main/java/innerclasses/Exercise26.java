package innerclasses;

import java.util.*;

class A {
	class B {
		B(int i){
			System.out.println("inner B construction " + i);
		}
	}
}

public class Exercise26 {

	class C extends A.B{

		C(A a){
			a.super(9);
		}
		public void hello(){
			System.out.println("hello world");
		}
	}

	public static void main (String [] args)
	{
		/* code */

		C mC = new Exercise26().new C(new A());
		mC.hello();
	}

}
