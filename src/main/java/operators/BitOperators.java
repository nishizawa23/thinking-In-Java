package operators;

import java.util.*;

public class BitOperators {
	public static void main (String [] args)
	{
		/* code */
		int a = 0xaaa;
		int b = 0x555;

		System.out.println("a : " + Integer.toBinaryString(a) + 
			" b : " + Integer.toBinaryString(b));

		System.out.println(" a & b = " + Integer.toBinaryString(a & b) + "\n"
			+ "a | b = " + Integer.toBinaryString(a | b) + "\n"
			+ "a ^ b = " + Integer.toBinaryString(a ^ b) + "\n"
			+ "~a = " + Integer.toBinaryString((~a)&0x0fff) + "\n"
			+ "~b = " + Integer.toBinaryString((~b)&0x0fff) + "\n");
	}
}
