package control;

import java.util.*;

public class Integer25Iteration {

	public static void main (String [] args)
	{
		/* code */
		Random mInteger = new Random();
		int j;
		int k = 100;
		for(int i = 0; i < 25; i++){
			j = mInteger.nextInt();	
			System.out.println("j is " + j);
			if(j > k)
				System.out.println(j + " > " + k);
			else if (j < k)
				System.out.println(j + " < " + k);
			else
				System.out.println(j + " = " + k);
		}
	}
}

