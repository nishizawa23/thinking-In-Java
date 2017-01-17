package initialization;

import java.util.*;

class Test {
	Test(String s){
		System.out.println("Test construct with string " + s);
	}
}

public class StringConstructionArray {
	public static void main (String [] args)
	{
		/* code */
		System.out.println("main start");
		Random mRand = new Random();
		Test [] mTestArray;
		mTestArray = new Test[mRand.nextInt(7)];
		for(Test t : mTestArray){
			t = new Test("hello !");
		}
	}
}
