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
	}
}
