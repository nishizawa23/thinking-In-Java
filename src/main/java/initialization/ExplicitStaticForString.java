package initialization;

import java.util.*;

public class ExplicitStaticForString {

	static String mString1 = "Hello";
	static String mString2;

	static {
		mString2 = new String("World");	
	}

	ExplicitStaticForString(){
		System.out.println("Construction ExplicitStaticForString");
	}

	public static void main (String [] args)
	{
		/* code */
		System.out.println("mString1 " + ExplicitStaticForString.mString1 +
			" mString2 " + ExplicitStaticForString.mString2);

		ExplicitStaticForString mObject = new ExplicitStaticForString();
	}
}
