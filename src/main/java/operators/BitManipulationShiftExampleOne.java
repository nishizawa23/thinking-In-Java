package operators;

import java.util.*;

public class BitManipulationShiftExampleOne {
	public static void main (String [] args)
	{
		/* code */
		int test = 0x8AC9575A;
		int testLength = 0;
		System.out.println(" test int : " + test);
		System.out.println(" test int binary : " + Integer.toBinaryString(test));

		testLength = Integer.toBinaryString(test).length();
		System.out.println(" test int bits: " + testLength);

		for(int i = 0; i < testLength-1 ; i++){
			System.out.println(" test int >> 1 : " + Integer.toBinaryString(test>>=1));
		}
	}
}
