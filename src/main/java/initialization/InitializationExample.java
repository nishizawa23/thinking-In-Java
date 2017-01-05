package initialization;

import java.util.*;

public  class InitializationExample {

	String mInitString;
	public static void main (String [] args)
	{
		/* code */
		InitializationExample mInitClass = new InitializationExample();
		System.out.println("Field mInitString with define null is "+(mInitClass.mInitString == null));
	}
}
