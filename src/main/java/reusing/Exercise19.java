package reusing;

import java.util.*;

public class Exercise19 {

	final int i = 9;
	final int j;

	Exercise19(){
		j = 10;
	}

	Exercise19(int n){
		j = n;
	}

	public String toString(){
		return "i : " + i + " j : " + j;
	}

	public static void main (String [] args)
	{
		/* code */
		Exercise19 mE1 = new Exercise19();
		System.out.println(mE1);
		Exercise19 mE2 = new Exercise19(100);
		System.out.println(mE2);
	}
}
