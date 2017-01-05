package control;

import java.util.*;

public class Fibonacci {

	public static void showNumber(int mArgs){
	
		if(mArgs < 2 ){
			System.out.println("mArgs is too small");
			return;
		}

		int a = 1;
		int b = 1;

		System.out.print("Fibonacci : " + a);
		System.out.print(" " + b);

		while(true){

			int tmp = a+b;
			if(tmp>mArgs)
				break;
			b = a;
			a = tmp;
			System.out.print(" " + tmp);
		}

		System.out.println(" ");
	}
	public static void main (String [] args)
	{
		/* code */
		int mArgs = Integer.parseInt(args[0]);

		System.out.println("mArgs : " + mArgs);

		Fibonacci.showNumber(mArgs);
	}
} 
