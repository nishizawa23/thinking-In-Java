package initialization;

import java.util.*;

public  class InitializationExample {

	String mInitString = "hello";
	String mInitStringConstruction;

	InitializationExample(){
		System.out.println("InitializationExample construction");
		System.out.println("mInitString is " + mInitString);
		mInitStringConstruction = new String("world");
		System.out.println("mInitStringConstruction is " + mInitStringConstruction);
	}

	public static void main (String [] args)
	{
		/* code */
		InitializationExample mInitClass = new InitializationExample();
		System.out.println("Field mInitString with define null is "+(mInitClass.mInitString == null));
	}
}
