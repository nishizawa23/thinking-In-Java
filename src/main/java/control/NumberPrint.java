package control;

import java.util.*;

public class NumberPrint {
	public static void main (String [] args)
	{
		/* code */
		System.out.println("for 1 to 100");

		for(int i = 0; i<100; i++){
			if(i==99)
				break;
			System.out.println(" i = " + (i+1));
		}
		return;
	}
}
