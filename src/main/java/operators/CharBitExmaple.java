package operators;

import java.util.*;

public class CharBitExmaple {

	public static void main (String [] args)
	{
		/* code */
		int min = 'A';
		int max = 'z';
		char tmp = 'A';

		//for(int i = 0; i < min - max; i++){
		for(int i = 0; i < max - min + 1; i++){
			System.out.println(tmp + " bit " + Integer.toBinaryString(tmp));
			tmp++;
		}
	}
}
