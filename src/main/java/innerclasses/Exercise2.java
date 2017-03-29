package innerclasses;

import java.util.*;

class Outer {
	private static final String mString = "heloo world";
	@Override
	public String toString(){
		return mString;
	}
}

class Exercise2 {
	public static void main (String [] args)
	{
		/* code */
		Outer [] mOuters = new Outer[10];
		for(Outer o : mOuters){
			o = new Outer();
			System.out.println(o);
		}
	}
}
