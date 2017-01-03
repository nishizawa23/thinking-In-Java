package operators;

import java.util.*;

public class StringCompare {

	private void StringCompareFunction(String a, String b){
		if( a != b ){
			System.out.println(" a != b ");
			System.out.println(" a equals b " + a.equals(b));
		}
		if( a == b ){
			System.out.println(" a == b ");
			System.out.println(" a equals b " + a.equals(b));
		}
	}

	public static void main (String [] args)
	{
		/* code */

		String a = "hello";
		String b = new String("world");
		String c = new String("world");
		String d = "world";
		String e = "world";

		System.out.println(" b == c "+(b==c));
		System.out.println(" d == e "+(d==e));

		StringCompare test = new StringCompare();
		test.StringCompareFunction(a,b);
		test.StringCompareFunction(a,a);
		test.StringCompareFunction(b,c);
		
	}
}
