package innerclasses;

import java.util.*;

class Outer {
	private static String mString;

	class Inner {
		@Override
		public String toString(){
			return mString;
		}
	}

	class Inner2 {
		@Override
		public String toString(){
			return "Inner2";
		}
	}

	Outer(){
		mString = "hello world!";
	}

	@Override
	public String toString(){
		return mString;
	}
}

class Exercise2 {
	public static void main (String [] args)
	{
		/* code */
		Outer.Inner [] mInners = new Outer.Inner[10];
		Outer [] mOuters = new Outer[10];
		for(Outer o : mOuters){
			o = new Outer();
			System.out.println(o.new Inner());
		}

		Outer mOuter = new Outer();
		Outer.Inner2 mInner2 = mOuter.new Inner2();
		System.out.println(mInner2);
	}
}
