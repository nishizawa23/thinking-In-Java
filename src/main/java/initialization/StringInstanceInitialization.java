package initialization;

import java.util.*;

public  class StringInstanceInitialization{

	String mStrings;

	{
		mStrings = new String("heloo world");
	}
	public static void main (String [] args)
	{
		/* code */
		System.out.println("mStrings " + new StringInstanceInitialization().mStrings);
	}
} 
