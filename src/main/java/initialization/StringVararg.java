package initialization;

import java.util.*;

public class StringVararg {
	public static void main (String [] args)
	{
		/* code */
		StringVararg mSV = new StringVararg();
		mSV.testString("hello","world");
		String[] s = {"one","two","three"};
		mSV.testString(s);
	}

	private void testString(String ... args){
		for(String s : args){
			System.out.println("s " + s);
		}
	}
} 
