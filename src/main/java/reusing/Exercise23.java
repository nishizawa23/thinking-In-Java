package reusing;

import java.util.*;

public class Exercise23 {

	static int i = printE();

	static int printE(){
		System.out.println("Just one time for class loading");
		return 77;
	}

	public static void main (String [] args)
	{
		/* code */
		System.out.println("i am here in main");
		Exercise23 mE = new Exercise23();
	}
}
