package control;

import java.util.*;

public class BitOperators {

	public static String showBinary(int a){
		String bitString = null;
		for(int i = 31 ; i >= 0; i--){
			bitString += ((a & (1<<i)) > 0) ? '1' : '0';
//			System.out.println(Integer.toBinaryString((a&(1<<i))));
		}
		return bitString.substring(4,bitString.length());
	}
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

		System.out.println(" a & b = " + BitOperators.showBinary(a & b) + "\n"
			+ "a | b = " + BitOperators.showBinary(a | b) + "\n"
			+ "a ^ b = " + BitOperators.showBinary(a ^ b) + "\n"
			+ "~a = " + BitOperators.showBinary((~a)&0x0fff) + "\n"
			+ "~b = " + BitOperators.showBinary((~b)&0x0fff) + "\n");

	}
}
