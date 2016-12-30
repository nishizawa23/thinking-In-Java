package operators;

import java.util.*;

public class LiteralsLongExample {

	public static void main (String [] args)
	{
		/* code */
		Long a = 0xffffffffL;
		System.out.println("a 16 : " + Long.toBinaryString(a));
		Long b = 027L;
		System.out.println("b 8 : " + Long.toBinaryString(b));
		Long c = 99L;
		System.out.println("c 10 : " + Long.toBinaryString(c));
	}
}
